package GA;

public class GeometriaAnaliticaEAlgebraLinear {

  public static void main(String[] args) {
    RetaR2 reta = new RetaR2(1f, 2f, 3f, 4f);
    RetaR2 reta2 = reta.NovaRetaMultiplicada.Operate(2f);
    reta.MostrarEquacaoGeral.Operate(reta);
    reta2.MostrarEquacaoGeral.Operate(reta2);
  }
}

// region Interfaces
@FunctionalInterface
interface OperateOnTwoLinesR2ReturningBoolean {
  public boolean Operate(RetaR2 reta1, RetaR2 reta2);
}

@FunctionalInterface
interface OperateOnOneLineR2AndReturnAsString {
  public String Operate(RetaR2 reta1);
}

@FunctionalInterface
interface OperateValueOnLineR2 {
  public void Operate(double constant);
}

@FunctionalInterface
interface OperateValueOnLineR2ReturningRetaR2 {
  public RetaR2 Operate(double constant);
}

@FunctionalInterface
interface OperateOnOneLineR2AndPointR2ReturningBoolean {
  public boolean Operate(RetaR2 x, PontoR2 y);
}

@FunctionalInterface
interface OperateOnOneLineR2AndPointR2 {
  public void Operate(RetaR2 x, PontoR2 y);
}

@FunctionalInterface
interface OperateOnOneLineR2 {
  public void Operate(RetaR2 x);
}

@FunctionalInterface
interface OperateOnTwoLineR2 {
  public void Operate(RetaR2 x, RetaR2 y);
}

@FunctionalInterface
interface OperateOnTwoLineR2ReturnLine {
  public RetaR2 Operate(RetaR2 x, RetaR2 y);
}

@FunctionalInterface
interface OperateOnThreeVectors3 {
  public Vetor3 Operate(Vetor3 y, Vetor3 x, Vetor3 z);
}

@FunctionalInterface
interface OperateOnTwoVectors3 {
  public Vetor3 Operate(Vetor3 y, Vetor3 x);
}

@FunctionalInterface
interface OperateOnThreeVectors2 {
  public Vetor2 Operate(Vetor2 y, Vetor2 x, Vetor2 z);
}

@FunctionalInterface
interface OperateOnTwoVectors2 {
  public Vetor2 Operate(Vetor2 y, Vetor2 x);
}

@FunctionalInterface
interface OperateOnTwoPoints2 {
  public PontoR2 Operate(PontoR2 y, PontoR2 x);
}

@FunctionalInterface
interface OperateOnThreePoints2 {
  public PontoR2 Operate(PontoR2 y, PontoR2 x, PontoR2 z);
}

@FunctionalInterface
interface OperateOnTwoPoints3 {
  public PontoR3 Operate(PontoR3 y, PontoR3 x);
}

@FunctionalInterface
interface OperateOnThreePoints3 {
  public PontoR3 Operate(PontoR3 y, PontoR3 x, PontoR3 z);
}

@FunctionalInterface
interface OperateOnThreeVectors3ReturnDouble {
  public double Operate(Vetor3 y, Vetor3 x, Vetor3 z);
}

@FunctionalInterface
interface OperateOnTwoVectors3ReturnDouble {
  public double Operate(Vetor3 y, Vetor3 x);
}

@FunctionalInterface
interface OperateOnThreeVectors2ReturnDouble {
  public double Operate(Vetor2 y, Vetor2 x, Vetor2 z);
}

@FunctionalInterface
interface OperateOnTwoVectors2ReturnDouble {
  public double Operate(Vetor2 y, Vetor2 x);
}

@FunctionalInterface
interface OperateOnTwoPoints2ReturnDouble {
  public double Operate(PontoR2 y, PontoR2 x);
}

@FunctionalInterface
interface OperateOnThreePoints2ReturnDouble {
  public double Operate(PontoR2 y, PontoR2 x, PontoR2 z);
}

@FunctionalInterface
interface OperateOnTwoPoints3ReturnDouble {
  public double Operate(PontoR3 y, PontoR3 x);
}

@FunctionalInterface
interface OperateOnThreePoints3ReturnDouble {
  public double Operate(PontoR3 y, PontoR3 x, PontoR3 z);
}

// endregion

// region Classes Base
class PontoR2 {
  double x, y;

  public PontoR2(double _x, double _y) {
    this.x = _x;
    this.y = _y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  // distancia entre dois pontos
  OperateOnTwoPoints2ReturnDouble Distancia = (ponto1, ponto2) -> {
    return Math.sqrt(Math.pow((ponto2.x - ponto1.x), 2) + Math.pow((ponto2.y - ponto1.y), 2));
  };
  // ponto medio entre dois pontos
  OperateOnTwoPoints2 PontoMedio = (ponto1, ponto2) -> {
    return new PontoR2(((ponto1.x + ponto2.x) / 2), ((ponto1.y + ponto2.y) / 2));
  };
  // baricentro entre tres pontos
  OperateOnThreePoints2 Baricentro = (ponto1, ponto2, ponto3) -> {
    return new PontoR2(((ponto1.x + ponto2.x + ponto3.x) / 3), ((ponto1.y + ponto2.y + ponto3.y) / 3));
  };

}

class PontoR3 {
  double x, y, z;

  public PontoR3(double _x, double _y, double _z) {
    this.x = _x;
    this.y = _y;
    this.z = _z;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getZ() {
    return z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  // distancia entre dois pontos
  OperateOnTwoPoints3ReturnDouble Distancia = (ponto1, ponto2) -> {
    return Math.sqrt(
        Math.pow((ponto2.x - ponto1.x), 2) + Math.pow((ponto2.y - ponto1.y), 2) + Math.pow((ponto2.z - ponto1.z), 2));
  };
  // ponto medio entre dois pontos
  OperateOnTwoPoints3 PontoMedio = (ponto1, ponto2) -> {
    return new PontoR3(((ponto1.x + ponto2.x) / 2), ((ponto1.y + ponto2.y) / 2), ((ponto1.z + ponto2.z) / 2));
  };
  // baricentro entre tres pontos
  OperateOnThreePoints3 Baricentro = (ponto1, ponto2, ponto3) -> {
    return new PontoR3(((ponto1.x + ponto2.x + ponto3.x) / 3), ((ponto1.y + ponto2.y + ponto3.y) / 3),
        ((ponto1.z + ponto2.z + ponto3.z) / 3));
  };

}

class Vetor {
}
// endregion

// region Classes Construtoras
class Vetor2 {
}

class Vetor3 {
}

class Reta {
  // mostrar equação geral
  OperateOnOneLineR2 MostrarEquacaoGeral = (reta1) -> {
    double xV = reta1.ponto1.y - reta1.ponto2.y;
    double yV = reta1.ponto2.x - reta1.ponto1.x;
    double c = (reta1.ponto1.x * reta1.ponto2.y) - (reta1.ponto1.y * reta1.ponto2.x);
    System.out.println(xV + "x " + yV + "y" + c + " = 0");
  };
  OperateOnOneLineR2AndReturnAsString EquacaoGeral = (reta1) -> {
    String valueToReturn = null;
    double xV = reta1.ponto1.y - reta1.ponto2.y;
    double yV = reta1.ponto2.x - reta1.ponto1.x;
    double c = (reta1.ponto1.x * reta1.ponto2.y) - (reta1.ponto1.y * reta1.ponto2.x);
    valueToReturn += Double.toString(xV) + "x " + Double.toString(yV) + "y" + Double.toString(c) + " = 0";
    return valueToReturn;
  };

  // mostrar equação reduzida
  OperateOnOneLineR2 MostrarEquacaoReduzida = (reta1) -> {
    double tangente = getTangente(reta1);
    double b = (tangente * reta1.ponto1.x) - reta1.ponto1.y;
    System.out.println("y = " + tangente + "x " + b);
  };

  // TODO mostrar equação parametrica da reta
  // ponto x pertence a reta
  // se a determinante for 0
  OperateOnOneLineR2AndPointR2ReturningBoolean PontoPertenceAReta = (reta1, ponto1) -> {
    return (((ponto1.x * reta1.ponto1.y) - (ponto1.x * reta1.ponto2.y))
        + ((ponto1.y * reta1.ponto2.x) - (ponto1.y * reta1.ponto1.x))
        + ((reta1.ponto1.x * reta1.ponto2.y) - (reta1.ponto1.y * reta1.ponto2.x))) == 0f;
  };

  // distancia de um ponto a reta
  public double getTangente(double y2, double y1, double x2, double x1) {
    return (y2 - y1) / (x2 - x1);
  }

  public double getTangente(PontoR2 ponto1, PontoR2 ponto2) {
    return (ponto2.y - ponto1.y) / (ponto2.x - ponto1.x);
  }

  public double getTangente(RetaR2 reta1) {
    return (reta1.ponto2.y - reta1.ponto1.y) / (reta1.ponto2.x - reta1.ponto1.x);
  }
}

class RetaR2 extends Reta {
  PontoR2 ponto1, ponto2;

  public RetaR2(PontoR2 r1, PontoR2 r2) {
    this.ponto1 = r1;
    this.ponto2 = r2;
  }

  public RetaR2(double x1, double y1, double x2, double y2) {
    this.ponto1 = new PontoR2(x1, y1);
    this.ponto2 = new PontoR2(x2, y2);
  }

  OperateValueOnLineR2 MultiplicaçãoDaReta = (value) -> {
    this.ponto1.x *= value;
    this.ponto1.y *= value;
    this.ponto2.x *= value;
    this.ponto2.y *= value;
  };
  OperateValueOnLineR2ReturningRetaR2 NovaRetaMultiplicada = (value) -> {
    RetaR2 reta2 = new RetaR2(this.ponto1.x, this.ponto1.y, this.ponto2.x, this.ponto2.y);
    reta2.ponto1.x *= value;
    reta2.ponto1.y *= value;
    reta2.ponto2.x *= value;
    reta2.ponto2.y *= value;
    return reta2;
  };
  // paralelas
  OperateOnTwoLinesR2ReturningBoolean Paralelas = (reta1, reta2) -> {
    return reta1.getTangente(reta1) == reta2.getTangente(reta2);
  };
  // concorrentes
  OperateOnTwoLinesR2ReturningBoolean Concorrentes = (reta1, reta2) -> {
    return reta1.getTangente(reta1) != reta2.getTangente(reta2)
        && reta1.EquacaoGeral.Operate(reta1).equals(reta2.EquacaoGeral.Operate(reta2));
  };
  // paralelas
  OperateOnTwoLinesR2ReturningBoolean Perpendiculares = (reta1, reta2) -> {
    return reta1.getTangente(reta1) == (-1f * reta2.getTangente(reta2));
  };
}

class Circunferencia {
}
// endregion