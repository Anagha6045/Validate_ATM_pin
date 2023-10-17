package encapsulation_Sample;

public class Sample_ParentClass
{
private int a;
private String name;

public void getter()
{
	System.out.println("The name is = " +name+ " The number is = "+a);
	                    
}
public void setter(String name,int a)
{
	this.name=name;
	this.a=a;
}
}
