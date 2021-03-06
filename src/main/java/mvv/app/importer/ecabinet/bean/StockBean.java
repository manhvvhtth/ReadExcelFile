package mvv.app.importer.ecabinet.bean;

import mvv.app.importer.cellparser.IntegerCellProcessor;
import mvv.app.importer.cellparser.LengthCellProcessor;
import mvv.app.importer.ecabinet.AbsBean;
import sun.security.util.Length;

/**
 * Created by Manh on 12/9/2015.
 */
public class StockBean extends AbsBean {
	private int qty;
	private String material;
	private double total_Calc_Area; /* mm */
	private double length; /* mm */
	private double width; /* mm */
	private double thickness; /* mm */

	@Override
	public void readCell(int idx, String stringCellValue) {
		switch (idx) {
			case 0:
				setQty(IntegerCellProcessor.getInstance().parseCellData(stringCellValue));
				break;
			case 1:
				setMaterial(stringCellValue);
				break;
			case 2:
				setTotal_Calc_Area(LengthCellProcessor.getInstance().parseCellData(stringCellValue));
				break;
			case 3:
				setLength(LengthCellProcessor.getInstance().parseCellData(stringCellValue));
				break;
			case 4:
				setWidth(LengthCellProcessor.getInstance().parseCellData(stringCellValue));
				break;
			case 5:
				setThickness(LengthCellProcessor.getInstance().parseCellData(stringCellValue));
				break;
		}
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getTotal_Calc_Area() {
		return total_Calc_Area;
	}

	public void setTotal_Calc_Area(double total_Calc_Area) {
		this.total_Calc_Area = total_Calc_Area;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
}
