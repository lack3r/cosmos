
/**
 * Abstract Factory Design Pattern
 * 
 * @author Andreas Loizou
 * @version 1.0
 * 
 */

Interface Window{
  public function getDescription();
}

Class WoodenWindow implements Window{
  public void getDescription(){
    System.out.println("I am a wooden window");
  }
}

Class IronWindow implements Window{
  public void getDescription(){
    System.out.println("I am an iron window");
  }
}

Interface WindowFitingExpert{
  public void getDescription();
}

class Welder implements WindowFittingExpert{
  public void getDescription(){
    System.out.println("I can only fit iron windows");
  }
}

class Carpenter implements WindowFittingExpert{
  public void getDescription(){
    System.out.println("I can only fit wooden windows");
  }
}

Interface WindowFactory{
  public Window makeWindow();
  public WindowFittingExpert makeFittingExpert();
}

// Wooden window factory to return carpenter and wooden window

Class WoodenWindowFactory implements WindowFactory{
  public Window makeWindow(){
    return new WoodenWindow();
  }
  public WindowFittingExpert makeFittingExpert(){
    return new Carpenter();
  }
}

// Iron window factory to return Welder and iron window

Class IronWindowFactory implements WindowFactory{
  public Window makeWindow(){
    return new IronWindow();
  }
  public WindowFittingExpert makeFittingExpert(){
    return new Welder();
  }
}
