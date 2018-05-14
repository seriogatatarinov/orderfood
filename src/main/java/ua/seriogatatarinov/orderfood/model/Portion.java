package ua.seriogatatarinov.orderfood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Portion implements Serializable {
	private int size;
	private int price;
}
