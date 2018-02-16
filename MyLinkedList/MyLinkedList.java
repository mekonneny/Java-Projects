/*Yonathan Mekonnen
  Date Structures and Object Programming (CMSC 256)
  Eclipse
  Program 3
  Purpose: to write the class MyLinkedList that implements all the abstract methods of the AbstratLinkedList class
 */
public class MyLinkedList<E> extends AbstractLinkedList<E> {
/// removes the first object in the list that .equals(element) 
 @Override
 public boolean remove(E element) {
  {
    Node<E> existing = myFront.getNext();
   while (!existing.equals(myBack))
   {
    existing.getPrevious().setNext(existing.getNext());
    existing.getNext().setPrevious(existing.getPrevious());
    mySize--;
   }
   existing = existing.getNext();
  }
  return false;
 }
    // checks if the list contains the given object 
 @Override
 public boolean contains(E element) {
       return lastIndexOf(element) != -1;
  
 }
 //gets the object at the given position 
 @Override
 public E get(int index) {
  return getNodeAt(index).getElement();
 
 }
 // looks through the list and gets the first time the given object is in it, returns the first position of -1 if it is not in the list
 @Override
 public int indexOf(E element) {
  Node<E> existing = myFront.getNext();
  for ( int i = 0; i < mySize - 1; i++)
  {
   if ( existing.getElement().equals(element))
   {
    return i;
   }
   existing = existing.getNext();
  }
  return -1; // if we do not find it 
 }
    // looks through the list and gets the last time the given object is in it, returns the last position of -1 if it is not in the list
 @Override
 public int lastIndexOf(E element) {
  Node<E> existing = myBack.getPrevious();
  for ( int i = size() - 1; i >= 0; i--)
  {
   if ( existing.getElement().equals(element))
   {
    return i;
   }
   existing = existing.getPrevious();
  }
  return -1; // if we do not find it
 }
    // gets the node at the index that is put in 
 @Override
 protected Node<E> getNodeAt(int index)  {

  Node<E> existing = myFront.getNext();

  for (int x = 0; x < index; x++) 
  {
   existing = existing.getNext();
  }

  return existing;  
 }
 //puts all of the elements in the linked list and puts them in the created array 
 @Override
 public E[] toArray() {
  E[] newtype = (E[]) new Object[size()];
  Node<E> existing = myFront.getNext();

  for (int i = 0; i <= mySize - 1; i++) 
  {
   newtype[i] = (E)existing.getElement();
   existing = existing.getNext();
  }
  return (E[]) newtype;
 }
//returns a string representation of the list, if a list contains 1, 2, 3, the following should be returned [1, 2, 3]
 @Override
 public String toString() {
  {
   StringBuilder builder = new StringBuilder("[");
   if (!isEmpty())
   {
    Node <E> existing = myFront.getNext();
    while (existing != myBack) 
    {
     E element = existing.getElement();
     builder.append(element.toString());
     if (existing.getNext() != myBack);
     {
      builder.append(",");
      
     }
     existing = existing.getNext();
    }
     
   }
   builder.append("]");
   return builder.toString();
  }
  }

}
