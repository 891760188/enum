# enum
枚举的使用
1.枚举就像是一个集合
2.类型安全，一个方法中的形参设置为int，那么只要传入int类型的任何值都是可以的，如果是枚举对象，就已经限定死了，此枚举的几种对象
3.有命名空间，以季节为例子，增加代码的可读性
4.要从一定的范围内取值，适合用枚举类型
5.enum和class interface  annnotation 的地位是一样的
6.enum类继承了java.lang.Enum 没有继承Object
7.枚举类的所有实例都必须放在第一行显示，不需要new关键字，不需要显示的调用构造器，自动添加public final static 
8.枚举的构造器是私有的
9.枚举类默认使用final 不能被继承

package enumcase;
　　public enum SeasonEnum {
    　　SPRING("春天"),
    　　SUMMER("夏天"),
    　　FALL("秋天"),
    　　WINTER("冬天");
　　
　　private final String name;
　　
　　private SeasonEnum(String name)
　　{
　　   this.name = name;
　　}
　　public String getName() {
　　  return name;
　　}
　}

实际上在第一行写枚举类实例的时候，默认是调用了构造器的，所以此处需要传入参数，因为没有显式申明无参构造器，只能调用有参数的构造器。 
　　构造器需定义成私有的，这样就不能在别处申明此类的对象了。枚举类通常应该设计成不可变类，它的Field不应该被改变，这样会更安全，而且代码更加简洁。所以我们将Field用private final修饰。
  
  枚举类型提供了两个有用的静态方法 values( ) 和 valueOf( ) 我们可以很方便的使用它们 
例如：
 for(SeasonEnum s : SeasonEnum .values())
     System.out.println(s);
     
     
     
此学习材料来自https://blog.csdn.net/android_freshman/article/details/52223542，感谢android_小路的无私分享
