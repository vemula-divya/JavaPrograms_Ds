package Hash;
import java.util.*;
public class HashMapImplem {
  static class HashMap < K, V > {
    private class Node {
      K key;
      V value;

      public Node(K k, V v) {
        this.key = k;
        this.value = v;
      }
    }

    private int n;
    private int N; //no. of buckets
    private LinkedList < Node > buckets[];

    public HashMap() {
      this.N = 4;
      this.buckets = new LinkedList[N];
      for (int i = 0; i < N; i++) {
        buckets[i] = new LinkedList < > ();
      }
    }

    private int getBucketIndex(K key) {
      return Math.abs(key.hashCode()) % N;
    }

    private int searchLinkedL(K key, int bi) {
      LinkedList < Node > ll = buckets[bi];

      for (int i = 0; i < ll.size(); i++) {
        Node n = ll.get(i);
        if (n.key == key) {
          return i;
        }
      }

      return -1;
    }
    private void rehash() {
      LinkedList < Node > old[] = buckets;
      buckets = new LinkedList[N * 2];

      for (int i = 0; i < N * 2; i++) {
        buckets[i] = new LinkedList < > ();
      }

      for (int i = 0; i < old.length; i++) {
        LinkedList < Node > ll = old[i];
        for (int j = 0; j < ll.size(); j++) {
          Node node = ll.get(j);
          put(node.key, node.value);
        }
      }

    }
    public void put(K k, V v) {
      int bi = getBucketIndex(k);
      int li = searchLinkedL(k, bi);
      if (li == -1) {
        buckets[bi].add(new Node(k, v));
        n++;
      } else {
        Node n = buckets[bi].get(li);
        n.value = v;
      }

      double lambda = (double) n / N;

      if (lambda > 2.0) {
        rehash();
      }

    }

    public boolean containsKey(K k) {
      int bi = getBucketIndex(k);
      int li = searchLinkedL(k, bi);
      if (li == -1) {
        return false;
      } else {
        return true;
      }
    }

    public V get(K k) {
      int bi = getBucketIndex(k);
      int li = searchLinkedL(k, bi);
      if (li == -1) {
        return null;
      } else {
        Node n = buckets[bi].get(li);
        return n.value;
      }

    }

    public V remove(K k) {
      int bi = getBucketIndex(k);
      int li = searchLinkedL(k, bi);
      if (li == -1) {
        return null;
      } else {
        Node node = buckets[bi].remove(li);
        n--;
        return node.value;
      }

    }

    public boolean isEmpty(K k) {
      return n == 0;
    }

    public ArrayList < K > keySet() {
      ArrayList < K > keys = new ArrayList < > ();
      for (int i = 0; i < buckets.length; i++) {
        LinkedList < Node > ll = buckets[i];
        for (int j = 0; j < ll.size(); j++) {
          Node node = ll.get(j);
          keys.add(node.key);
        }
      }
      return keys;
    }

  }

  public static void main(String[] args) {
    HashMap < String, Integer > map = new HashMap < > ();
    map.put("india", 99);
    map.put("australia", 88);
    map.put("usa", 90);
    System.out.println(map.get("india"));
    System.out.println(map.containsKey("indian"));
    map.remove("usa");
    ArrayList < String > keys = map.keySet();
    for (int i = 0; i < keys.size(); i++) {
      System.out.println(keys.get(i) + "  " + map.get(keys.get(i)));

    }

  }

}


