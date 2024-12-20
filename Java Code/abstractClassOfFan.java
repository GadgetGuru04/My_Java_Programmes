abstract class FAN
{
	abstract void ON();
	abstract void OFF();
}

class USHA extends FAN
{
	String name = "Usha";
	void ON(){
		System.out.println(name+FAN's Switch ON);
		}
	void OFF(){System.out.println(name+FAN's Switch OFF);}
}

class VOLTAS extends FAN
{
	String name = "Voltage";
	void ON(){System.out.println(name+FAN's Switch ON);}
	void OFF(){System.out.println(name+FAN's Switch OFF);}
}

public static void main(Strings[]args)


