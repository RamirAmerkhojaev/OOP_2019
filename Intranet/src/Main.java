import java.util.*;
import java.io.*;

public class Main implements Serializable{

	public static boolean login(String login, String password) throws IOException{
		String filename = "";
		switch (hero) {
		case Admin:
			filename = "adminlogin.txt";
			break;
		case Teacher:
			filename = "loginteacher.txt";
			break;
		case Employee:
			filename = "employeelogin.txt";
			break;
		case Student:
			filename = "studentlogin.txt";
			break;
		case Manager:
			filename = "ORmanagerlogin.txt";
			break;
		case TechSupportGuy:
			filename = "TechSupportGuyLogin.txt";
			break;

		}
		String str = login + " " + password;
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line;
		while((line = br.readLine())!=null) {
			if(str.equals(line)) {
				System.out.println("You are connected!");
				return true;
			}
			else {
				System.out.println("Wrong login or password!");
				return false;
			}
		}
		return true;
	}

	static Hero hero;
	public static Vector<Student> students;
	public static Vector<Teacher> teachers;
	public static Vector<Course> courses;
	public static Vector<CourseFiles> coursefiles;
	public static Vector<User> users;
	public static Vector<Order> orders;
	public static Vector<News> news;

	public static void main(String[] args) throws IOException {	


		news = new Vector<News>();
		students = new Vector<Student>();
		teachers = new Vector<Teacher>();
		courses = new Vector<Course>();
		coursefiles = new Vector<CourseFiles>();
		users = new Vector<User>();
		orders = new Vector<Order>();
		Deserialization();

		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("Welcome user, choose your hero:");
			System.out.println("1)Admin");
			System.out.println("2)Teacher");
			System.out.println("3)Emloyee");
			System.out.println("4)ORManager");
			System.out.println("5)Student");
			System.out.println("5)Executor");

			int a = input.nextInt();

			if(a == 1) {
				hero = Hero.Admin;
				Admin admin = new Admin("123", "admin", "123asd", "Ramir");
				System.out.println("You are trying to enter as an admin");
				System.out.println("Enter your login and password");
				String login = input.next();
				String password = input.next();
				if(login.contentEquals("123") && password.contentEquals("admin"))
					while(true) {
						System.out.println(admin.actions());
						while(true) {
							int num = input.nextInt();
							if(num == 1) {
								String loginU = input.next();
								String passwordU = input.next();
								String idU = input.next();
								User user = new User(loginU, passwordU, idU);
								admin.addUser(user);
								ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
								oos.writeObject(users);
								oos.close();
							}
							else if(num == 2) {
								String newPassword = input.next();
								String id = input.next();
								admin.updateUserInfo(newPassword, id);
							}
							else if(num == 3) {
								admin.viewUsersInfo();
							}
							else if(num == 4) {
								String id = input.next();
								admin.removeUser(id);
								ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
								oos.writeObject(users);
								oos.close();
							}
							else if(num == 0) {
								break;
							}
						}
					}
				else {
					System.out.println("Wrong login or password!");
				}
			}
			else if(a == 2) {
				hero = Hero.Teacher;
				Teacher t = new Teacher();
				System.out.println("You are trying to enter as a teacher");
				System.out.println("Enter your login and password");
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("teacher.txt"));
				String loginT = input.next();
				String passwordT = input.next();
				if(!login(loginT, passwordT))
					continue;
				bw.write("Username: " + loginT+"\n");
				bw.write("Password: " + passwordT+"\n");
				System.out.println(t.actions());
				while(true) {
					int num = input.nextInt();
					if(num == 1) {
						String name = input.next();
						System.out.println(t.viewStudentsInfo(name));
					}
					else if(num == 2) {
						t.viewCourses();
					}

					else if(num == 3) {
						String courseName = input.next();
						String file = input.next();
						String content = input.next();
						CourseFiles courseFiles = new CourseFiles(courseName, file, content);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coursefiles.txt"));
						oos.writeObject(coursefiles);
						oos.close();
					}
					else if(num == 4) {
						String file = input.next();
						t.deleteFile(file);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coursefiles.txt"));
						oos.writeObject(coursefiles);
						oos.close();
					}
					else if(num == 5) {
						String nameCourse = input.next();
						Course course = new Course(nameCourse);
						String nameStudent = input.next();
						int yearOfStudy = input.nextInt();
						String id = input.next();
						Student student = new Student(nameStudent, yearOfStudy, id);
						double firstAttestation = input.nextDouble();
						double secondAttestation = input.nextDouble();
						double finalMark = input.nextDouble();
						Mark mark = new Mark(firstAttestation, secondAttestation, finalMark);
						t.giveMark(student, course, mark);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("marks.txt"));
						oos.writeObject(student.marks);
						oos.close();
					}
					else if(num == 0) {
						break;
					}
				}
			}
			else if(a == 3) {
				hero = Hero.Employee;
				Employee e = new Employee();
				System.out.println("You are trying to enter as an employee");
				System.out.println("Enter your login and password");
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt"));
				String loginE = input.next();
				String passwordE = input.next();
				if(!login(loginE, passwordE))
					continue;
				bw.write("Username: " + loginE+"\n");
				bw.write("Password: " + passwordE+"\n");
				System.out.println(e.actions());
				while(true) {
					int num = input.nextInt();
					if(num == 1) {
						String orderTitle = input.next();
						String text = input.next();
						String room = input.next(); 
						if(room.equals("ROUND_HALL")) {
							Order order = new Order(orderTitle,text, Rooms.ROUND_HALL);
							e.sendOrder(order);
						}
						else if(room.equals("COWORKING")) {
							Order order = new Order(orderTitle,text, Rooms.COWORKING);
							e.sendOrder(order);
						}
						else if(room.equals("COWORKING")) {
							Order order = new Order(orderTitle,text, Rooms.BUSINESS_HALL);
							e.sendOrder(order);
						}
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("order.txt"));
						oos.writeObject(orders);
						oos.close();
					}
					else if(num == 2) {
						String id = input.next();
						double sum = input.nextDouble();
						Employee emp = new Employee(id, sum);
						emp.getSalary();
					}
					else if(num == 0) {
						break;
					}
				}
			}
			else if(a == 4) {
				hero = Hero.Manager;
				ORManager orm = new ORManager();
				System.out.println("You are trying to enter as an OR Manager");
				System.out.println("Enter your login and password");
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("manager.txt", true));
				String loginM = input.next();
				String passwordM = input.next();
				if(!login(loginM, passwordM))
					continue;
				bw.write("Username: " + loginM+"\n");
				bw.write("Password: " + passwordM+"\n");
				System.out.println(orm.actions());
				while(true) {
					int num = input.nextInt();
					if(num == 1) {
						String name = input.next();
						int numOfCredits = input.nextInt();
						String faculty = input.next();
						Course course = new Course(name, numOfCredits, faculty);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("course.txt", true));
						oos.writeObject(courses);
						oos.close();
					}
					else if(num == 2) {
						String name = input.next();
						int yearOfStudy = input.nextInt();
						String id = input.next();
						Student Student = new Student(name, yearOfStudy, id);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.txt", true));
						oos.writeObject(students);
						oos.close();
					}
					else if(num == 3) {
						String id = input.next();
						double salary = input.nextDouble();
						String name = input.next();
						Teacher teacher = new Teacher(id, salary, name);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt", true));
						oos.writeObject(teachers);
						oos.close();
					}
					else if(num == 4) {
						String title = input.next();
						String content = input.next();
						int time = input.nextInt();
						Date datetime = new Date(time);
						News n = new News(title, content, datetime);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("news.txt", true));
						oos.writeObject(news);
						oos.close();
					}
					else if(num == 0) {
						break;
					}
				}
			}
			else if(a == 5) {
				hero = Hero.Student;
				Student s = new Student();
				System.out.println("You are trying to enter as an Student");
				System.out.println("Enter your login and password");
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt", true));
				String loginS = input.next();
				String passwordS = input.next();
				if(!login(loginS, passwordS))
					continue;
				bw.write("Username: " + loginS+"\n");
				bw.write("Password: " + passwordS+"\n");
				System.out.println(s.actions());
				while(true) {
					int num = input.nextInt();
					if(num == 1) {
						String name = input.next();
						int credits = input.nextInt();
						String faculty = input.next();
						Course course = new Course(name, credits, faculty);
						s.registerCourse(course);
					}
					else if(num == 2) {
						String name = input.next();
						int credits = input.nextInt();
						String faculty = input.next();
						Course course = new Course(name, credits, faculty);
						s.viewTeacherInfo(course);
					}
					else if(num == 4) {
						String name = input.next();
						int credits = input.nextInt();
						String faculty = input.next();
						Course course = new Course(name, credits, faculty);
						s.viewMarks(course);
					}
					else if(num == 3) {
						s.transcript();
					}
					else if(num == 0) {
						break;
					}
				}
			}
			else if(a == 6) {
				hero = Hero.TechSupportGuy;
				TechSupportGuy t = new TechSupportGuy();
				System.out.println("You are trying to enter as an Executor");
				System.out.println("Enter your login and password");
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("techsupport.txt", true));
				String loginTech = input.next();
				String passwordTech = input.next();
				if(!login(loginTech, passwordTech))
					continue;
				bw.write("Username: " + loginTech+"\n");
				bw.write("Password: " + passwordTech+"\n");
				System.out.println(t.actions());
				while(true) {
					int num = input.nextInt();
					if(num == 1) {
						String orderTitle = input.next();
						String text = input.next();
						String room = input.next(); 
						if(room.equals("ROUND_HALL")) {
							Order order = new Order(orderTitle,text, Rooms.ROUND_HALL);
							TechSupportGuy.addOrder(order);
						}
						else if(room.equals("COWORKING")) {
							Order order = new Order(orderTitle,text, Rooms.COWORKING);
							TechSupportGuy.addOrder(order);
						}
						else if(room.equals("COWORKING")) {
							Order order = new Order(orderTitle,text, Rooms.BUSINESS_HALL);
							TechSupportGuy.addOrder(order);
						}
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("order.txt", true));
						oos.writeObject(orders);
						oos.close();
					}
					else if(num == 2) {
						String orderTitle = input.next();
						String text = input.next();
						String room = input.next(); 
						if(room.equals("ROUND_HALL")) {
							Order order = new Order(orderTitle,text, Rooms.ROUND_HALL);
							t.acceptOrder(order);
						}
						else if(room.equals("COWORKING")) {
							Order order = new Order(orderTitle,text, Rooms.COWORKING);
							t.acceptOrder(order);
						}
						else if(room.equals("COWORKING")) {
							Order order = new Order(orderTitle,text, Rooms.BUSINESS_HALL);
							t.acceptOrder(order);
						}
					}
					else if(num == 3) {
						String orderTitle = input.next();
						t.rejectOrder(orderTitle);
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("order.txt", true));
						oos.writeObject(orders);
						oos.close();
					}
					else if(num == 4) {
						t.viewNewOrders();
					}
					else if(num == 0) {
						break;
					}
				}
			}

		}
	}

	private static void Deserialization(){
		try {
			ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("teacher.txt"));
			oot.writeObject(teachers);
			oot.flush();
			oot.close();
			ObjectOutputStream oot1 = new ObjectOutputStream(new FileOutputStream("student.txt"));
			oot1.writeObject(students);
			oot1.flush();
			oot1.close();
			ObjectOutputStream oot2 = new ObjectOutputStream(new FileOutputStream("course.txt"));
			oot2.writeObject(courses);
			oot2.flush();
			oot2.close();
			ObjectOutputStream oot3 = new ObjectOutputStream(new FileOutputStream("cousefiles.txt"));
			oot3.writeObject(coursefiles);
			oot3.flush();
			oot3.close();
			ObjectOutputStream oot4 = new ObjectOutputStream(new FileOutputStream("users.txt"));
			oot4.writeObject(users);
			oot4.flush();
			oot4.close();
			ObjectOutputStream oot5 = new ObjectOutputStream(new FileOutputStream("orders.txt"));
			oot5.writeObject(orders);
			oot5.flush();
			oot5.close();
			ObjectOutputStream oot6 = new ObjectOutputStream(new FileOutputStream("news.txt"));
			oot6.writeObject(news);
			oot6.flush();
			oot6.close();

		}catch (IOException ioe){
			System.out.println("Problems with files");
		}
	}

}
