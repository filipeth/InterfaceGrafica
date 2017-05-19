package View;

class ArvoreDecisao {
	

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ArvoreDecisao.Odor(i);
    return p;
  }
  static double Odor(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (i[4].equals("a")) {
      p = 0;
    } else if (i[4].equals("c")) {
      p = 1;
    } else if (i[4].equals("f")) {
      p = 1;
    } else if (i[4].equals("l")) {
      p = 0;
    } else if (i[4].equals("m")) {
      p = 1;
    } else if (i[4].equals("n")) {
    p = ArvoreDecisao.SporePrintColor(i);
    } else if (i[4].equals("p")) {
      p = 1;
    } else if (i[4].equals("s")) {
      p = 1;
    } else if (i[4].equals("y")) {
      p = 1;
    } 
    return p;
  }
  static double SporePrintColor(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 0;
    } else if (i[19].equals("b")) {
      p = 0;
    } else if (i[19].equals("h")) {
      p = 0;
    } else if (i[19].equals("k")) {
      p = 0;
    } else if (i[19].equals("n")) {
      p = 0;
    } else if (i[19].equals("o")) {
      p = 0;
    } else if (i[19].equals("r")) {
      p = 1;
    } else if (i[19].equals("u")) {
      p = 0;
    } else if (i[19].equals("w")) {
    p = ArvoreDecisao.GillSize(i);
    } else if (i[19].equals("y")) {
      p = 0;
    } 
    return p;
  }
  static double GillSize(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (i[7].equals("b")) {
      p = 0;
    } else if (i[7].equals("n")) {
    p = ArvoreDecisao.GillSpacing(i);
    } 
    return p;
  }
  static double GillSpacing(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (i[6].equals("c")) {
      p = 1;
    } else if (i[6].equals("d")) {
      p = 0;
    } else if (i[6].equals("w")) {
    p = ArvoreDecisao.Population(i);
    } 
    return p;
  }
  static double Population(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 0;
    } else if (i[20].equals("a")) {
      p = 0;
    } else if (i[20].equals("c")) {
      p = 1;
    } else if (i[20].equals("n")) {
      p = 0;
    } else if (i[20].equals("s")) {
      p = 0;
    } else if (i[20].equals("v")) {
      p = 0;
    } else if (i[20].equals("y")) {
      p = 0;
    } 
    return p;
  }
}
