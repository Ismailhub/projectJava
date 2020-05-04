package co.g2academy.indoapril_1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_order_detail")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ModelOrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int No;
    private Integer Qty_Detail;
    private Integer Id_Barang;
//    private String Nama_Barang;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "Id_Barang", insertable=false, updatable=false)
    private  ModelBarang barang;

    private String Id_Order;
//    private String Tgl_Order;  insertable=false, updatable=false
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Order", insertable=false, updatable=false )
    private ModelOrder order;

//    private String Alamat_Penempatan;

}