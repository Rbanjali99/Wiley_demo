package Core_java;



public class CompileTime {
	
	public int add(int a, int b){
		int v = a + b;
		return v;
	}
	public float add(float a, int b){
		float v = a + b;
		return v;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTime ct = new CompileTime();
		System.out.println(ct.add(2, 3));
		System.out.println(ct.add(3.5f, 3));

	}

}
