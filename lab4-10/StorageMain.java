import java.util.ArrayList;

class Storage<T>
{
    private ArrayList<T> list = new ArrayList<>();

    public void addItem(T item)
    {
        list.add(item);
    }

    public T getItem(int index)
    {
        return list.get(index);
    }

    public void showAll()
    {
        for (T item: list)
        {
            System.out.println(item);
        }
    }
}

public class StorageMain
{
    public static void main(String[] args)
    {
        System.out.println("图书仓库:");
        Storage<String> bookStorage = new Storage<>();
        bookStorage.addItem("Java程序设计");
        bookStorage.addItem("数据结构");
        bookStorage.addItem("人工智能导论");
        bookStorage.showAll();

        System.out.println("商品编号仓库:");
        Storage<Integer> indexStorage = new Storage<>();
        indexStorage.addItem(1001);
        indexStorage.addItem(1002);
        indexStorage.addItem((1003));
        indexStorage.showAll();
    }
}
