package trafficlight;

enum Lights {
	GREEN("Light is Green - Go!", 5000), RED("Light is Red - Stop!", 3000 ), YELLOW("Light is Yellow - Beware!", 2000);
	
	private String label; 
	private int waiting;
	
	Lights( String l, int w){
		waiting = w;
		label = l;
	}
	
	int getTime() {
		return waiting;
	}
	
	String getLabel() {
		return label;
	}
}


