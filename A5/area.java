class rect
{ 
            int l,b; 
            rect(int x,int y) 
            { 
                        l=x; 
                        b=y; 
		System.out.println("Area of rectangle is "+l*b);
            } 
           
}; 
class area
{ 
            
            public static void main (String args[]) 
            { 
                        rect r= new rect(20,10); 
                        System.out.println(r.l);
			System.out.print(r.b);
            } 
};