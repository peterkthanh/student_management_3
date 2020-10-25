/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Hocviendao {

//    public void insert(Hocvien model) {
//        String sql = "INSERT INTO Hocvien(maKH, maNH, diem) VALUES(?, ?, ?)";
//        JdbcHelper.executeUpdate(sql,
//                model.getMaKH(),
//                model.getMaNH(),
//                model.getDiem());
//    }

//    public void update(Hocvien model) {
//        String sql = "UPDATE Hocvien SET maKH=?, maNH=?, diem=? WHERE maHV=?";
//        JdbcHelper.executeUpdate(sql,
//                model.getMaKH(),
//                model.getMaNH(),
//                model.getDiem(),
//                model.getMaHV());
//    }

//    public void delete(String MaHV) {
//        String sql = "DELETE FROM Hocvien WHERE maHV=?";
//        JdbcHelper.executeUpdate(sql, MaHV);
//    }

    public List<Hocvien> select() {
        String sql = "SELECT * FROM HOCSINH";
        return select(sql);
    }

    public Hocvien findById(String MaHV) {
        String sql = "SELECT * FROM HOCSINH WHERE maHS=?";
        List<Hocvien> list = select(sql, MaHV);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<Hocvien> select(String sql, Object... args) {
        List<Hocvien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Hocvien model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Hocvien readFromResultSet(ResultSet rs) throws SQLException {
        Hocvien model = new Hocvien();
        model.setMaHS(rs.getString("MaHS"));
        model.setMaHoSo(rs.getString("MaHoSo"));
        model.setMaLop(rs.getString("MaLop"));
        model.setMaKQ(rs.getString("MaKetQua"));
        model.setMaHL(rs.getString("MaHocLuc"));
        model.setMaHK(rs.getString("MaHanhKiem"));
        model.setDiemTBCN(rs.getDouble("DiemTBCaNam"));
        return model;

    }
}
