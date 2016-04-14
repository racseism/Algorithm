import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;


/***
 * This circular array currently coded for charcter data type, but in future, it 
 * will be converted into generic function and will work for all data types.
 * @author rajkuma
 * Currently code is not synchronized.
 * 	Next item to make this code synchronous.
 */
public class CircularArray {
	
	private int startIndex = 0;
	
	private int endIndex = 0;
	
	private int currentElementCount;
	
	char buffer[];
	
	public CircularArray(int size){
		this.buffer = new char[size];
		this.currentElementCount = 0;
	}
	
	public void addElement(char element){
		if (currentElementCount != buffer.length){
			buffer[endIndex] = element;
			endIndex = (endIndex + 1) % buffer.length;
			this.currentElementCount++;
			return;
		}
		
		throw new BufferOverflowException();
	}
	
	public boolean isEmtpy(){
		return this.currentElementCount == 0;
	}
	
	public void addTailElement(char element){
		if (currentElementCount != buffer.length){
			startIndex = (startIndex - 1 - buffer.length) % buffer.length;
			buffer[startIndex] = element;
			this.currentElementCount++;
			return;
		}
		
		throw new BufferOverflowException();
	}
	
	public void RemoveTailElement(){
		if (!isEmtpy()){
			startIndex = (startIndex + 1)% buffer.length;
			currentElementCount--;
			return;
		}
		
		throw new NoSuchElementException("There is not sufficient in buffer");
	}
	
	public char GetTailNextElement(){
		if (this.currentElementCount > 1){
			return buffer[(startIndex + 1) % buffer.length];
		}
		
		throw new NoSuchElementException("There is not sufficient element in buffer");
	}
	
	public char GetTailElement(){
		return buffer[startIndex];
	}
}
