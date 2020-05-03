import java.util.*;

public class MyVector {
	Vector v = null;
//	Object[] objArr;
	Object[] data = null;
	int capacity = 0;
	int size = 0;
	
	public MyVector(int capacity){
		if(capacity <0)
			throw new IllegalArgumentException("유효하지 않은 값입니다. :"+capacity);
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public MyVector() {
		this(10);
	}
	
	void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}
	
	boolean add(Object obj) {
		ensureCapacity(size+1);
		data[size++] = obj;
//		size++;
		return true;
	}
	
	public Object get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}
	
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index<0||index>=size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		
		oldObj = data[index];
		
		if(index!=size-1)
			System.arraycopy(data, index+1, data, index, size-1-index);
		
		data[--size]=null;
		return oldObj;
	}
	
	public boolean remove(Object obj) {
		for(int i=0; i<size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity == capacity) return;
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, Math.min(size, capacity));
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear() {
		for(int i=0; i<data.length;i++)
			data[i] = null;
		size =0;
	}
	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	
	int size() { return size;}
	int capacity() { return data.length; }
	boolean isEmpty() { return size==0; }
	
/**********************************************/
/*         List인터페이스로부터 상속받은 메서드들            */
/**********************************************/ 
	public boolean contains(Object o) { return indexOf(o,0) >= 0; }
	public Iterator iterator() { return null; }
	public Object[] toArray(Object a[]) {return null;}
	public boolean containsAll(Collection c) {return false;}
	public boolean addAll(Collection c) {return false;}
	public boolean addAll(int index, Collection c) {return false;}
	public boolean removeAll(Collection c) {return false;}
	public boolean retainAll(Collection c) {return false;}
	
	public boolean equals(Object o) {
		if(o instanceof MyVector) {
			MyVector tmp = (MyVector)o;
			if(this.size == tmp.size && this.capacity == tmp.capacity) {
				for(int i=0; i<data.length; i++) {
					if(!tmp.data[i].equals(this.data[i]))
						return false;
				}
				return true;
			}
		}
		return false;
	}
	
	
	public Object set(int index, Object element) {
		if(index >= capacity)
			throw new ArrayIndexOutOfBoundsException(index);
		Object oldValue = get(index);
		data[index] = element;
		return oldValue;
	}
	
	
	public void add(int index, Object element) {
		ensureCapacity(size+1);
		data[size++] = element;
	}
	
	
	public int lastIndexOf(Object o) {
		if(size <= 0)
			return -1;
		
		if(o==null) {
			for(int i=size-1; i>=0; i--)
				if(data[i]==null)
					return i;
		} else {
			for(int i=size-1; i>=0; i--)
				if(o.equals(data[i]))
					return i;
		}
		
		
		return -1;
	}
	
	
	public ListIterator listIterator() {return null;}
	public ListIterator listIterator(int index) {return null;}
	public List subList(int fromIndex, int toIndex) {return null;}
	
//	default void sort(Comparator c) {}
//	default Spliterator spliterator() {}
//	default void replaceAll(UnaryOperator operator) {}
	
	int indexOf(Object obj) {
		for(int i=0;i<size; i++)
			if(data[i].equals(obj))
				return i;
		return -1;
	}
	
	public int indexOf(Object o, int index) {
		if (o == null) {
			for(int i = index; i< size; i++) {
				if(data[i]==null)
					return i;
			}
		} else {
			for(int i= index; i< size ; i++)
				if(o.equals(data[i]))
					return i;
		}
		
		return -1;
	}
	
	public String toString() {
		String tmp="[";
		for(int i=0; i<size; i++)
			tmp+=data[i]+",";
		
		return tmp+"]";
	}
}
