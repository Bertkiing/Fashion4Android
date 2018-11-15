### DataBinding库集成

[DataBinding的参考文档](https://developer.android.com/topic/libraries/data-binding/start)

### 遇到的问题

1. [使用中用到了控制View的状态：View.VISIBLE:View.GONE](https://stackoverflow.com/questions/32068675/data-binding-expression-not-compiling)

2. 将布局直接转化为Data binding 格式
    1. 对根布局直接使用快捷键就可以看到;
    
3. 在生成对应的binding文件时(即：build之前)，先将setContentView 注释掉,否则将会出现未知错误;

4. 在使用过程中，有可能用到命名冲突的问题，可以使用alias来避免



### DataBinding的优点
1. 使用DataBinding，从此告别findViewById();
2. DataBinding可以告别空指针所引发的Crash;
> Generated data binding code automatically checks for null values and avoid null pointer exceptions. 
3. DataBinding support Event handling(事件处理)
4. 变量类型在编译器被检查(The variable types are inspected at compile time...)
5. Data binding can be used to give your data objects the ability to notify other objects...(DataBinding 可以根据数据变化来通知修改UI) 
    1. 这里有3中可观察的类型：objects , fields , collections






