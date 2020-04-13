package comm.example.demo.bean;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Component("i")
public class Image {


	@Value(value = "id1")
	private String imageID;
	@Value("demourl1")
	private String imageURL;

}
