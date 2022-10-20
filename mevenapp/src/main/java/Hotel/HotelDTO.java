package Hotel;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class HotelDTO implements Serializable{
	
	
	public HotelDTO() {
		// TODO Auto-generated constructor stub
	}
	private  int id;
	private String name;
	private String foodItem;
	private String price;
	private String rating;
	

}
