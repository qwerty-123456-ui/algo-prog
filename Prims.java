import java.util.*;
public class Prims
{
    public  int isVisited[] = new int[15];
    public  int cost[][] = new int[10][10];
 public int minimum_cost;
      
    public void calc(int n)
    {   
        int flag[] = new int[n+1];
        int i,j,min=999,num_edges=1,a=1,b=1,minpos_i=1,minpos_j=1;
          
  while(num_edges < n)
        {    
             
            for(i=1,min=999;i<=n;i++)
             for(j=1;j<=n;j++)
              if(this.cost[i][j]<min)
                if(this.isVisited[i]!=0)
                 {
                      min=this.cost[i][j];
                      a=minpos_i=i;
                      b=minpos_j=j;
                 }
 if(this.isVisited[minpos_i]==0 || this.isVisited[minpos_j]==0)
             {
  System.out.println("Edge Number \t"+num_edges+"\t from Vertex \t"+a+"\t  to Vertex \t"+b+"-minimum cost:"+min+" \n");
                      this.minimum_cost=this.minimum_cost+min;
        num_edges=num_edges+1; 
                      this.isVisited[b]=1;
             }
                   this.cost[a][b]=this.cost[b][a]=999;   
         
         
  }   
          
    }
    public static void main(String args[])
    {
        int nodes,i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Nodes \n");
        nodes = in.nextInt();
        Prims p = new Prims();
        System.out.println("Enter the Cost Matrix Weights : \n");
        for(i=1;i<=nodes;i++)
          for(j=1;j<=nodes;j++)
          {
            System.out.println("Enter the weight from node "+i+" to node "+j+"\n");
            p.cost[i][j]=in.nextInt();
            if(p.cost[i][j]==0)
              p.cost[i][j]=999;
          }
        
        p.isVisited[1]=1; // Initialization 
        System.out.println("Minimum spanning tree \n");
	 long st=System.nanoTime();

	p.calc(nodes);
         long ft=System.nanoTime();
            System.out.println("time elapsed "+(ft-st));

          
    }   
}
