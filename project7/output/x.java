class x
{
  private String g;
  
  public x(String paramString)
  {
    g = paramString;
  }
  
  public void d()
  {
    int i = 0;
    String str = "";
    for (i = 0; i < g.length(); i++) {
      str = str + new k().l(g.charAt(i) + new z().y());
    }
    if (str.equals(new y().z())) {
      new v().y(1);
    } else {
      new v().y(0);
    }
  }
}

/* Location:
 * Qualified Name:     x
 * Java Class Version: 1.2 (46.0)
 * JD-Core Version:    0.7.1
 */