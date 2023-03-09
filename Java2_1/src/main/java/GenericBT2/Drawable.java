package GenericBT2;

public class Drawable {
    public <T extends IHinhHoc> void draw(T t){
        String tmp = String.format("Vẽ hiình %s, có S là%.2f, chu vi la %.2f",t.getClass().getSimpleName(),t.tinhDienTich(),t.tinhChuVi());
        System.out.println(tmp);
    }
}
