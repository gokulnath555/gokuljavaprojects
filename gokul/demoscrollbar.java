import java.awt.*;
class sample extends Frame
{
	sample()
	 {
		Scrollbar s=new Scrollbar();
		s.setBounds(100,100,75,75);
		add(s);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
	 }
}
class demoscrollbar
{
	public static void main(String args[])
	 {
	     sample s=new sample();
	}
}


/*
class
object
return type
inheritance
super
this
final
try
catch
InterruptedException f {}
IOException f {}
private
protected
public
extends 
package
abstract
constractor
overloading 
overriding
method overloading
cons overloading
overriding ref keyword
io package
DataInputStream dis=new DataInputStream(System.in);
Str=dis.readLine();
int x=Integer.valueOf(dis.readLine()).integerValue();
int x=Integer.ParseInt(dis.readLine());
String str=new String("gokul");
StringBuilder s=new StringBuilder("gokul");
Thread
extends Thread
implements Runnable
setName
getName
setPriority();
getPriority(Thread.Max_PRIORITY();
isAlive
Thread method
start();
run();
sleep();
stop();
join();
notify();
notifyAll();
wait();
interThread communication
Thread Synchronization
Hashmap
Hashset
Treeset
LinkedList
ArrayList
Frame f=new Frame();
extends Frame
TextField
Label
Button
List
Scrollbox
Choice
Checkbox
CheckboxGroup
TextArea
setSize();
setLayout();
setVisible();
setBounds();
setBackground();
setForeground();
Panel p=new Panel(new GridLayout(1,1));
*/