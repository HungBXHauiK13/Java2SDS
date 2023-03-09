package GenericBT2;

public class HinhTron implements IHinhHoc {
    private double banKinh = 1.0;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return banKinh * 2 * Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return banKinh * banKinh * Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                "chuVi=" + tinhChuVi() +
                "dienTich=" + tinhDienTich() +
                '}';
    }
}
