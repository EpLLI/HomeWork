public class Tegi {

	public static void main(String[] args) {
		String str="ololl <p id=p1> ololoF <p id=p2> <tt>olol <p id=p1> <p id>o  <p>oljg";//строка пример
		 System.out.println(str);
        System.out.println(str.replaceAll("<p"+".*?>", "<p>"));//замена регулярным вырожением 
       
        }
	}

