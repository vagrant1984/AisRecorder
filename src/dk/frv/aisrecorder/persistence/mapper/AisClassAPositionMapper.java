package dk.frv.aisrecorder.persistence.mapper;

import dk.frv.aisrecorder.persistence.domain.AisClassAPosition;

public interface AisClassAPositionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_position
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int deleteByPrimaryKey(Integer mmsi);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_position
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int insert(AisClassAPosition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_position
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int insertSelective(AisClassAPosition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_position
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	AisClassAPosition selectByPrimaryKey(Integer mmsi);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_position
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int updateByPrimaryKeySelective(AisClassAPosition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_position
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int updateByPrimaryKey(AisClassAPosition record);
}