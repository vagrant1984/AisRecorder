package dk.frv.aisrecorder.persistence.mapper;

import dk.frv.aisrecorder.persistence.domain.AisClassAStatic;

public interface AisClassAStaticMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_static
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int deleteByPrimaryKey(Integer mmsi);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_static
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int insert(AisClassAStatic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_static
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int insertSelective(AisClassAStatic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_static
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	AisClassAStatic selectByPrimaryKey(Integer mmsi);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_static
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int updateByPrimaryKeySelective(AisClassAStatic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_class_a_static
	 * @mbggenerated  Wed Dec 07 20:13:18 CET 2011
	 */
	int updateByPrimaryKey(AisClassAStatic record);
}