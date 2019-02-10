

	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.LocalTime;
	import java.time.Month;
	import java.util.concurrent.TimeUnit;

	public class TimeDuration  {
		
		
		
		public TimeDuration(long i) {
			if (i < 0 ) {
				try {
					throw new Exception("bad value");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
					}
				}
		
		public String  toString() {
			long i=0;
			if(i < 0) {
	            throw new IllegalArgumentException("Duration must be greater than zero!");
	        }

				long hours =TimeUnit.MILLISECONDS.toHours(i);
				 i -= TimeUnit.HOURS.toMillis(hours);
				long minutes =TimeUnit.MILLISECONDS.toMinutes(i);
				 i -= TimeUnit.MINUTES.toMillis(minutes);
				long seconds =TimeUnit.MILLISECONDS.toSeconds(i);
				 StringBuilder sb = new StringBuilder(6554);
			  
			        sb.append(hours);
			        sb.append(" Hours ");
			        sb.append(minutes);
			        sb.append(" Minutes ");
			        sb.append(seconds);
			        sb.append(" Seconds");
			        return(sb.toString());
				
			}
				
		

		

	}

