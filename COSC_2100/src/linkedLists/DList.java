/**
 * 
 */
package linkedLists;

/**
 * @author Praveen Madiraju
 *
 */
public class DList<T> {

	private DLLNode<T> header;
	private DLLNode<T> trailer;

	private int size;

	/**
	 * 
	 */
	public DList() {
		header = null;
		trailer = null;
		size = 0;

	}

	/**
	 * @return the header
	 */
	public DLLNode<T> getHeader() {
		return header;
	}

	/**
	 * @return the trailer
	 */
	public DLLNode<T> getTrailer() {
		return trailer;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	// add element to the front of the list
	public void addToFront(T elem) {
		DLLNode<T> newNode = new DLLNode<T>(elem);

		if (header == null) {
			header = newNode;
		}
		if (trailer == null)
			trailer = newNode;
		else {
			newNode.setLink(header);
			header.setBack(newNode);
			header = newNode;
		}
		size++;

	}

	// add element to the end of the list
	public void addToLast(T elem) {
		DLLNode<T> newNode = new DLLNode<T>(elem);
		newNode.setLink(null);

		if (trailer == null) {
			trailer = newNode;
			header = newNode;
		} else {
			trailer.setLink(newNode);
			newNode.setBack(trailer);
			trailer = newNode;
		}

		size++;
	}

	public boolean isEmpty() {
		return header == null;
	}

	public String toString() {
		DLLNode<T> node = header;
		String result = "";
		while (node != null) {
			result += node.getInfo();
			result += "<=>";
			node = (DLLNode<T>) node.getLink();
		}
		result = result.substring(0, result.length() - 3);
		return result;
	}

	public void print() {
		DLLNode<T> v = header;
		while (v != null) {
			System.out.println(v.getInfo());
			v = v.getLink();
		}

	}

}