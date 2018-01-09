package itman.robert.b.b;

import java.util.ArrayList;
import java.util.List;

public abstract class a
  implements c
{
  protected b a;
  protected List<itman.robert.b.b> b = new ArrayList();

  protected int a(float paramFloat1, float paramFloat2)
  {
    return Math.max(1, (int)(3.063052912151454D / Math.asin(paramFloat2 / paramFloat1) + 0.5D));
  }

  public b a()
  {
    if (this.a == null)
      this.a = new b();
    return this.a;
  }

  public void a(b paramb)
  {
    this.a = paramb;
    this.b.clear();
  }

  public List<itman.robert.b.b> b()
  {
    return this.b;
  }

  protected int c()
  {
    return Math.round(this.a.e * 255.0F);
  }
}

/* Location:           G:\programs\dex2jar-2.0\vidogram-dex2jar.jar
 * Qualified Name:     itman.robert.b.b.a
 * JD-Core Version:    0.6.0
 */