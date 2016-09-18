package com.bruce.designpatter.Iterator;

public class NameRespository implements Contains {

	public String name[] = {"bruce", "Iris", "king"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new nameIterator();
	}
	
	private class nameIterator implements Iterator{
		int index;
		
		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (this.hasNext()){
				return name[index++];
			}
			return null;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (index < name.length){
				return true;
			}
			return false;
		}
		
		
		
	} 

}
