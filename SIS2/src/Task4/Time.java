package Task4;


    public class Time implements Comparable<Time>{
    
	private int hour;
	private int minute;
	private int second;

	public Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
		if(hour >= 24 || minute > 60 || second > 60) {
			System.out.println("Wrong Time Data!");
			System.exit(0);
		}
	}
	public int compareTo(Object otherobject) {
		Time o = (Time) otherobject;
		int res = hour - o.hour;
		if(res == 0) {
			res = minute - o.minute;
			if(res == 0) {
				res = second - o.second;
			}
		}
		return res;
	}
	
	public String toUniversal() {
          return "Universal: "+Zero(hour)+":"+Zero(minute)+":"+Zero(second);
    }
	
	public String toStandart() {
		String PmOrAm;
		
		if(hour<12) {
			PmOrAm = "PM";
			 return "Standart: "+Zero(hour)+":"+Zero(minute)+":"+Zero(second)+" "+PmOrAm;
		}else {
			PmOrAm = "AM";
			return "Standart: "+Zero(hour-12)+":"+Zero(minute)+":"+Zero(second)+" "+PmOrAm;
		}
	}
	
	public String Zero(int info) {
	   if(info < 10) {
		   return "0"+info;
	   }else {
		   return ""+info;
	   }
    }
	
	
	public void add(Time t) {
		
	   hour = (hour + t.hour) %24;
	   minute = minute + t.minute;
	   minute += second / 60;
	   hour += minute / 60;
       second = second + t.second;
       minute %= 60;
       second %= 60;
     
		
	}
	public String toString() {
		return hour+"";
	}
	
 }

