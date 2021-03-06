package comzxw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name="tbl_userinfo")
@Entity(name = "tbl_userinfo")
public class UserInfo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String username;
    private  String email;
    private  String sex;
    private  String province;
    private  String hobby;

}
