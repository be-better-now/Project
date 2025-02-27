/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.FlowerDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.DBUtils;

/**
 *
 * @author tungi
 */
public class FlowerDAO implements IDAO<FlowerDTO, String> {

    @Override
    public boolean create(FlowerDTO entity) {
        String sql = "INSERT INTO tblFlowers"
                + " (FlowerID,FlowerName,Quality,Category,Price,Quantity) "
                + " VALUES (?,?,?,?,?,?)";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getFlowerID());
            ps.setString(2, entity.getFlowerName());
            ps.setString(3, entity.getQuality());
            ps.setString(4, entity.getCategory());
            ps.setDouble(5, entity.getPrice());
            ps.setInt(6, entity.getQuantity());

            int i = ps.executeUpdate();
            return i > 0;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    @Override
    public List<FlowerDTO> readAll() {
        return null;
    }

    @Override
    public FlowerDTO readById(String id) {
        return null;
    }

    @Override
    public boolean update(FlowerDTO entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<FlowerDTO> search(String searchTerm) {
        return null;
    }

    public List<FlowerDTO> searchByTitle(String searchTerm) {
        String sql = "SELECT * FROM tblFlowers WHERE flowerName LIKE ?";
        List<FlowerDTO> list = new ArrayList<>();
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + searchTerm + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FlowerDTO flower = new FlowerDTO(
                        rs.getString("FlowerID"),
                        rs.getString("FlowerName"),
                        rs.getString("Quality"),
                        rs.getString("Category"),
                        rs.getDouble("Price"),
                        rs.getInt("Quantity"));
                list.add(flower);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return list;
    }

    public List<FlowerDTO> searchByTitle2(String searchTerm) {
        String sql = "SELECT * FROM tblFlowers WHERE flowerName LIKE ? AND Quantity>0";
        List<FlowerDTO> list = new ArrayList<>();
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + searchTerm + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FlowerDTO flower = new FlowerDTO(
                        rs.getString("FlowerID"),
                        rs.getString("FlowerName"),
                        rs.getString("Quality"),
                        rs.getString("Category"),
                        rs.getDouble("Price"),
                        rs.getInt("Quantity"));
                list.add(flower);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return list;
    }

    public boolean updateQuantityToZero(String id) {
        String sql = "UPDATE tblFlowers SET Quantity=0 WHERE flowerID=?";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            
            int i = ps.executeUpdate();
            return i > 0;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }
}