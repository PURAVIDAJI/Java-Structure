package List;

public class Node <E> {
  //인스턴스 변수
  //데이터 필드 + 링크 필드
  private E item;
  private Node<E> next;

  //생성자
  public Node(E newItem){
    this.item = newItem;
    next = null;
  }
  //메서드
  //item과 next 가져오기 위한 get 메소드
  //item과 next에 데이터와 레퍼런스 저장하기 위한 set 메서드



  public E getItem(){
    return item;
  }

  public Node<E> getNext(){
    return next;
  }

  public void setItem(E newItem) {
    this.item = newItem;
  }

  public void setNext(Node<E> newNext) {
    this.next = newNext;
  }


}

//현재 null을 가리키는 애가  가리켜야합니다.
