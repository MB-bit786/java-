// 33. ArrayList programs
import java.util.*;
class ArrayListPrograms {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Red"); list.add("Green"); list.add("Blue");
        System.out.println(list);
        for(String c:list) System.out.println(c);
        list.add(0,"White"); System.out.println(list);
        System.out.println(list.get(2));
        list.set(1,"Yellow"); System.out.println(list);
        list.remove(2); System.out.println(list);
        System.out.println(list.contains("Blue"));
        Collections.sort(list); System.out.println(list);
        ArrayList<String> list2=new ArrayList<>(list);
        System.out.println(list2);
        Collections.shuffle(list); System.out.println(list);
        HashSet<String> set=new HashSet<>(); set.add("A"); set.add("B");
        System.out.println(set);
        for(String s:set) System.out.println(s);
        System.out.println(set.size());
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"A"); map.put(2,"B");
        System.out.println(map.size());
        Collections.reverse(list); System.out.println(list);
        System.out.println(list.subList(0,2));
        System.out.println(list.equals(list2));
        Collections.swap(list,0,1); System.out.println(list);
        list.addAll(list2); System.out.println(list);
        String[] arr=set.toArray(new String[set.size()]);
        System.out.println(Arrays.toString(arr));
        ArrayList<String> list3=new ArrayList<>(set);
        System.out.println(list3);
        System.out.println(map.isEmpty());
        list.ensureCapacity(20);
        list.set(1,"Black"); System.out.println(list);
        for(int i=0;i<list.size();i++) System.out.println(list.get(i));
        HashSet<String> set2=new HashSet<>(); set2.add("A"); set2.add("C");
        set.retainAll(set2); System.out.println(set);
        System.out.println(map.values());
    }
}