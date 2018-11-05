import java.util.Stack;

public class Calculator {
	
	private Stack<Integer> intStack;

	public Calculator() {
		intStack = new Stack<Integer>();
	}
	
	public void loadConstant(int constant) {
		intStack.push(constant);
	}
	
	public String toString() {
		
		String currentValue = "[";
		if(intStack.size() == 0) {
			return "[].";
		} else if (intStack.size() == 1){
			for(int i = 0; i < intStack.size(); i++) {
				currentValue += intStack.elementAt(i);
			}
		} else {
			for(int i = 0; i < intStack.size(); i++) {
				if(i != intStack.size() -1) {
					currentValue += intStack.elementAt(i) + " ";
				} else {
					currentValue += intStack.elementAt(i);
				}

		}}
		currentValue += "].";
		
		return currentValue;
	}
	public void add() {
		int num = 0;
		num += intStack.elementAt(intStack.size() - 1);
		num += intStack.elementAt(intStack.size() - 2);
		intStack.remove(intStack.elementAt(intStack.size() - 1));
		intStack.remove(intStack.elementAt(intStack.size() - 1));
		intStack.push(num);
	}
	
	public void subtract() {
		int num = intStack.elementAt(intStack.size() - 2);
		num -= intStack.elementAt(intStack.size() - 1);
		intStack.remove(intStack.elementAt(intStack.size() - 1));
		intStack.remove(intStack.elementAt(intStack.size() - 1));
		intStack.push(num);
	}
	
	public void total() {
		for(int i = 0; i < intStack.size() + 3; i++) {
			add();
		}
	}
	
	public void divide() {
		int num = intStack.elementAt(intStack.size() - 2);
		num /= intStack.elementAt(intStack.size() - 1);
		intStack.remove(intStack.elementAt(intStack.size() - 1));
		intStack.remove(intStack.elementAt(intStack.size() - 1));
		intStack.push(num);
	}
	
	public void multiply() {
		int num = intStack.elementAt(intStack.size() - 2);
		num *= intStack.elementAt(intStack.size() - 1);
		intStack.remove(intStack.elementAt(intStack.size() - 1));
		intStack.remove(intStack.elementAt(intStack.size() - 1));
		intStack.push(num);
	}
}
