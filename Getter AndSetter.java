//default constructor
Customer()
{
	setCustomer(0,"Not Available","Not Available");
}
//parameterized constructor
Customer(int x, String y, String z)
{
	setCustomer(x, y, z);
}
//setters
public void setCustomer(int x, String y, String z)
{
	setcustNo(x);
	setcustName(y);
	setcustAddr(z);
}

public void setcustNo(int x){custNo=x;}
public void setcustName(String x){custName=x;}
public void setcustAddr(String x){custAddr=x;}

//getters
public int getcustNo(){return custNo;}
public String getcustName(){return custName;}
public String getcustAddr(){return custAddr;}

public void init(Customer C)
{
	C.setCustomer(0,"Not Available","Not Available");
}
public void init(Customer C,int x, String y, String z)
{
	C.setCustomer(x,y,z);
}
public void display(Customer C)
{
	System.out.println(getcustNo() + getcustName() + getcustAddr());
}
