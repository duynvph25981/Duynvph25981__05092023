package com.example.Duynvph25981__05092023.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@NoArgsConstructor
@Table(name="ChiTietSP")
@AllArgsConstructor
@Getter
@Setter
public class ChiTietSanPham {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    String id;

    @Column(name = "NamBH")
    int namBH;

    @Column(name = "MoTa")
    String moTa;

    @Column(name = "SoLuongTon")
    int soLuongTon;

    @Column(name = "GiaNhap")
    int giaNhap;

    @Override
    public String toString() {
        return "ChiTietSanPham{" +
                "id='" + id + '\'' +
                ", namBH=" + namBH +
                ", moTa='" + moTa + '\'' +
                ", soLuongTon=" + soLuongTon +
                ", giaNhap=" + giaNhap +
                '}';
    }

    public ChiTietSanPham(String id) {
        this.id = id;
    }
}
