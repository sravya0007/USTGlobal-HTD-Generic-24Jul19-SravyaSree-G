package com.dev.threadss;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main thread started...");

//new t2().start();

//new Thread(new T3()).start();
Thread.currentThread().setName("Main thread");
System.out.println(Thread.currentThread().getName());

Thread2 t2=new Thread2();
t2.setName("Second thread");
System.out.println(t2.getName());
t2.start();

T3 t3=new T3();

Thread th=new Thread(t3);
th.setName("thirs thread");
System.out.println("main thread id"+ Thread.currentThread().getId());
System.out.println("second thread id: "+t2.getId());
System.out.println("third thread id: "+th.getId());


System.out.println(th.getName());
th.start();

for(int i=0;i<=10;i++) {
	System.out.println("i= "+i);
}



System.out.println("main thread terminated...");

	}

}
