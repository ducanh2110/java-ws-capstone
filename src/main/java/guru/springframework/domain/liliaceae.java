package guru.springframework.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class liliaceae {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private float temperature;
    private float humidity;
    private int brightness;
    private String nutrients;
    private Date createdDate;
    private Date updatedTime;
    
    public liliaceae() {
	
	}
    
	public liliaceae(Integer id, float temperature, float humidity, int brightness, String nutrients, Date createdDate,
			Date updatedTime) {

		this.id = id;
		this.temperature = temperature;
		this.humidity = humidity;
		this.brightness = brightness;
		this.nutrients = nutrients;
		this.createdDate = createdDate;
		this.updatedTime = updatedTime;
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", temperature=" + temperature + ", humidity=" + humidity + ", brightness="
				+ brightness + ", nutrients=" + nutrients + ", createdDate=" + createdDate + ", updatedTime="
				+ updatedTime + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public int getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	public String getNutrients() {
		return nutrients;
	}
	public void setNutrients(String nutrients) {
		this.nutrients = nutrients;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}


    


}
