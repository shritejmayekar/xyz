import prog.StopWatch;
class Test{
	public static void main(String[] args){
	StopWatch.start();
	for(int i=0;i<10000;i++)
		System.out.println("55");
	StopWatch.stop();
	StopWatch.showElapse();
}
}
