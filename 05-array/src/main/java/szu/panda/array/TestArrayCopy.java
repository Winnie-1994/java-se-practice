package szu.panda.array;

//二维数组
//数组的拷贝
public class TestArrayCopy {
  public static void main(String args[]) {
    String[] s = 
            {"Mircosoft","IBM","Sun","Oracle","Apple"};
    String[] sBak = new String[6];
    System.arraycopy(s,0,sBak,0,s.length); //使用java.lang.System类的静态方法arraycopy，若源数据数目超过目标数组边界会抛出IndexOutOfBoundsException异常
    
    for(int i=0;i<sBak.length;i++){
      System.out.print(sBak[i]+" ");
    }
    
    System.out.println();
    //静态初始化
    int[][] intArray = {{1,2},{1,2,3},{3,4}};
    //int[3][2] intArray = {{1,2},{1,2},{3,4}};  //非法
    //动态初始化
    int[][] intArrayBak = new int[3][];
    System.arraycopy
            (intArray,0,intArrayBak,0,intArray.length);
    intArrayBak[2][1] = 100;
    
    for(int i = 0;i<intArray.length;i++){
        for(int j =0;j<intArray[i].length;j++){
            System.out.print(intArray[i][j]+"  "); 
        }
        System.out.println();
    }
  }
}
