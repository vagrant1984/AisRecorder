package dk.frv.aisrecorder.persistence.domain;

public class AisClassAPosition {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_class_a_position.mmsi
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	private Integer mmsi;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_class_a_position.nav_status
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	private Byte navStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_class_a_position.rot
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	private Double rot;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_class_a_position.special_man_indicator
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	private Byte specialManIndicator;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_class_a_position.mmsi
	 * @return  the value of ais_class_a_position.mmsi
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	public Integer getMmsi() {
		return mmsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_class_a_position.mmsi
	 * @param mmsi  the value for ais_class_a_position.mmsi
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	public void setMmsi(Integer mmsi) {
		this.mmsi = mmsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_class_a_position.nav_status
	 * @return  the value of ais_class_a_position.nav_status
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	public Byte getNavStatus() {
		return navStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_class_a_position.nav_status
	 * @param navStatus  the value for ais_class_a_position.nav_status
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	public void setNavStatus(Byte navStatus) {
		this.navStatus = navStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_class_a_position.rot
	 * @return  the value of ais_class_a_position.rot
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	public Double getRot() {
		return rot;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_class_a_position.rot
	 * @param rot  the value for ais_class_a_position.rot
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	public void setRot(Double rot) {
		this.rot = rot;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_class_a_position.special_man_indicator
	 * @return  the value of ais_class_a_position.special_man_indicator
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	public Byte getSpecialManIndicator() {
		return specialManIndicator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_class_a_position.special_man_indicator
	 * @param specialManIndicator  the value for ais_class_a_position.special_man_indicator
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	public void setSpecialManIndicator(Byte specialManIndicator) {
		this.specialManIndicator = specialManIndicator;
	}
}