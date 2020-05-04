package co.g2academy.indoapril_1.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_barang_masuk")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ModelBarangMasuk implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id_Barang_Masuk;
    private String Nomor_Surat_Jalan;
//    private Integer Id_Barang;
    private Integer Qtt_Barang_Masuk;
    private Date Tanggal_Pemesanan ;
    private Date Tanggal_Masuk;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "Id_Barang")
    private ModelBarang masterBarang;

}
