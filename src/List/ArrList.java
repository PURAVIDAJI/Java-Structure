package List;

public class ArrList<E> {
  //인스턴스 변수
  private  E a[]; //private E[] a;
  private int size;
  //생성자
  public ArrList(){
    a = (E[]) new Object[1];
    //최초로 1개의 원소 가진 배열 생성!
    size=0; //크기는 1이지만 비어있음.
  }
  //연산 메서드
  public int size(){
    return size;
  }
  public E get(int k){
    if(size == 0 && k>=size)
      throw new IndexOutOfBoundsException();
    return a[k];
  }
  public boolean add(E e){

    //size++;
    if(a.length ==size){
      //throw new ArrayIndexOutOfBoundsException();
      resize(a.length*2);
    }
    a[size++] = e;
    return true;
  }

  public void add(E v,int i){
    //size++;
    if(a.length ==size){
      resize(a.length*2);
    }

    //어떤 index에 넣기 전에 그게

    for (int j = size-1; j >=i; j--) {
      a[j+1] = a[j];
    }
    a[i] = v;
    size++;
  }

  public E remove(){//remove last만 구현
    if(size == 0)
      throw new IndexOutOfBoundsException();
    //size++;

    E tobedeleted = a[size-1];
    a[size-1] = null;
    size--;
    if(a.length*(1/4) ==size){
      //throw new ArrayIndexOutOfBoundsException();
      resize(a.length*(1/2));
    }
    return tobedeleted;
  }


  public void remove(int i){
    if(a.length*(1/4) ==size){
      //throw new ArrayIndexOutOfBoundsException();
      resize(a.length*(1/2));
    }
    for (int j = i+1; j < size; j++) {
      a[j-1] = a[j];
    }
    size--;
  }

  //리사이즈 함수
  private void resize(int newSize){
    System.out.println("resize가 호출됨 (" +newSize+")");
    E[] t = (E[])new Object[newSize]; //E를 원소로 가지는 배열 ㄴㄴ?
    for (int i = 0; i < size; i++) {
      t[i] = a[i];
    }
    a=t; //a에 t의 주소를 할당한다.
  }
  //사이즈 함수와 length 함수의 차이점은 무엇인가?

  public <E> int indexof(E e){
    int index = -1;
    for (int i = 0; i <size ; i++) {
      //size변수 or a.length 사용해서 크기 한정하고 for문 돌리기
      if (e==a[i])
      {index= i;
        break;}
    }return index;
  }

}
