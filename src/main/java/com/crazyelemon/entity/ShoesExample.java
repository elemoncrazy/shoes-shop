package com.crazyelemon.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShoesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andShoesIdIsNull() {
            addCriterion("shoes_id is null");
            return (Criteria) this;
        }

        public Criteria andShoesIdIsNotNull() {
            addCriterion("shoes_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoesIdEqualTo(Integer value) {
            addCriterion("shoes_id =", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdNotEqualTo(Integer value) {
            addCriterion("shoes_id <>", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdGreaterThan(Integer value) {
            addCriterion("shoes_id >", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_id >=", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdLessThan(Integer value) {
            addCriterion("shoes_id <", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_id <=", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdIn(List<Integer> values) {
            addCriterion("shoes_id in", values, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdNotIn(List<Integer> values) {
            addCriterion("shoes_id not in", values, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdBetween(Integer value1, Integer value2) {
            addCriterion("shoes_id between", value1, value2, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_id not between", value1, value2, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesNumberIsNull() {
            addCriterion("shoes_number is null");
            return (Criteria) this;
        }

        public Criteria andShoesNumberIsNotNull() {
            addCriterion("shoes_number is not null");
            return (Criteria) this;
        }

        public Criteria andShoesNumberEqualTo(Integer value) {
            addCriterion("shoes_number =", value, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberNotEqualTo(Integer value) {
            addCriterion("shoes_number <>", value, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberGreaterThan(Integer value) {
            addCriterion("shoes_number >", value, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_number >=", value, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberLessThan(Integer value) {
            addCriterion("shoes_number <", value, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_number <=", value, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberIn(List<Integer> values) {
            addCriterion("shoes_number in", values, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberNotIn(List<Integer> values) {
            addCriterion("shoes_number not in", values, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberBetween(Integer value1, Integer value2) {
            addCriterion("shoes_number between", value1, value2, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_number not between", value1, value2, "shoesNumber");
            return (Criteria) this;
        }

        public Criteria andShoesNameIsNull() {
            addCriterion("shoes_name is null");
            return (Criteria) this;
        }

        public Criteria andShoesNameIsNotNull() {
            addCriterion("shoes_name is not null");
            return (Criteria) this;
        }

        public Criteria andShoesNameEqualTo(String value) {
            addCriterion("shoes_name =", value, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameNotEqualTo(String value) {
            addCriterion("shoes_name <>", value, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameGreaterThan(String value) {
            addCriterion("shoes_name >", value, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameGreaterThanOrEqualTo(String value) {
            addCriterion("shoes_name >=", value, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameLessThan(String value) {
            addCriterion("shoes_name <", value, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameLessThanOrEqualTo(String value) {
            addCriterion("shoes_name <=", value, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameLike(String value) {
            addCriterion("shoes_name like", value, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameNotLike(String value) {
            addCriterion("shoes_name not like", value, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameIn(List<String> values) {
            addCriterion("shoes_name in", values, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameNotIn(List<String> values) {
            addCriterion("shoes_name not in", values, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameBetween(String value1, String value2) {
            addCriterion("shoes_name between", value1, value2, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesNameNotBetween(String value1, String value2) {
            addCriterion("shoes_name not between", value1, value2, "shoesName");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleIsNull() {
            addCriterion("shoes_price_sale is null");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleIsNotNull() {
            addCriterion("shoes_price_sale is not null");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleEqualTo(Float value) {
            addCriterion("shoes_price_sale =", value, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleNotEqualTo(Float value) {
            addCriterion("shoes_price_sale <>", value, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleGreaterThan(Float value) {
            addCriterion("shoes_price_sale >", value, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleGreaterThanOrEqualTo(Float value) {
            addCriterion("shoes_price_sale >=", value, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleLessThan(Float value) {
            addCriterion("shoes_price_sale <", value, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleLessThanOrEqualTo(Float value) {
            addCriterion("shoes_price_sale <=", value, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleIn(List<Float> values) {
            addCriterion("shoes_price_sale in", values, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleNotIn(List<Float> values) {
            addCriterion("shoes_price_sale not in", values, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleBetween(Float value1, Float value2) {
            addCriterion("shoes_price_sale between", value1, value2, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesPriceSaleNotBetween(Float value1, Float value2) {
            addCriterion("shoes_price_sale not between", value1, value2, "shoesPriceSale");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountIsNull() {
            addCriterion("shoes_discount is null");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountIsNotNull() {
            addCriterion("shoes_discount is not null");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountEqualTo(Float value) {
            addCriterion("shoes_discount =", value, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountNotEqualTo(Float value) {
            addCriterion("shoes_discount <>", value, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountGreaterThan(Float value) {
            addCriterion("shoes_discount >", value, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("shoes_discount >=", value, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountLessThan(Float value) {
            addCriterion("shoes_discount <", value, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountLessThanOrEqualTo(Float value) {
            addCriterion("shoes_discount <=", value, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountIn(List<Float> values) {
            addCriterion("shoes_discount in", values, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountNotIn(List<Float> values) {
            addCriterion("shoes_discount not in", values, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountBetween(Float value1, Float value2) {
            addCriterion("shoes_discount between", value1, value2, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDiscountNotBetween(Float value1, Float value2) {
            addCriterion("shoes_discount not between", value1, value2, "shoesDiscount");
            return (Criteria) this;
        }

        public Criteria andShoesDescIsNull() {
            addCriterion("shoes_desc is null");
            return (Criteria) this;
        }

        public Criteria andShoesDescIsNotNull() {
            addCriterion("shoes_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShoesDescEqualTo(String value) {
            addCriterion("shoes_desc =", value, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescNotEqualTo(String value) {
            addCriterion("shoes_desc <>", value, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescGreaterThan(String value) {
            addCriterion("shoes_desc >", value, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescGreaterThanOrEqualTo(String value) {
            addCriterion("shoes_desc >=", value, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescLessThan(String value) {
            addCriterion("shoes_desc <", value, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescLessThanOrEqualTo(String value) {
            addCriterion("shoes_desc <=", value, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescLike(String value) {
            addCriterion("shoes_desc like", value, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescNotLike(String value) {
            addCriterion("shoes_desc not like", value, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescIn(List<String> values) {
            addCriterion("shoes_desc in", values, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescNotIn(List<String> values) {
            addCriterion("shoes_desc not in", values, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescBetween(String value1, String value2) {
            addCriterion("shoes_desc between", value1, value2, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesDescNotBetween(String value1, String value2) {
            addCriterion("shoes_desc not between", value1, value2, "shoesDesc");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeIsNull() {
            addCriterion("shoes_onsale_time is null");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeIsNotNull() {
            addCriterion("shoes_onsale_time is not null");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeEqualTo(Date value) {
            addCriterionForJDBCDate("shoes_onsale_time =", value, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("shoes_onsale_time <>", value, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("shoes_onsale_time >", value, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shoes_onsale_time >=", value, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeLessThan(Date value) {
            addCriterionForJDBCDate("shoes_onsale_time <", value, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shoes_onsale_time <=", value, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeIn(List<Date> values) {
            addCriterionForJDBCDate("shoes_onsale_time in", values, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("shoes_onsale_time not in", values, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shoes_onsale_time between", value1, value2, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOnsaleTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shoes_onsale_time not between", value1, value2, "shoesOnsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeIsNull() {
            addCriterion("shoes_offsale_time is null");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeIsNotNull() {
            addCriterion("shoes_offsale_time is not null");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeEqualTo(Date value) {
            addCriterionForJDBCDate("shoes_offsale_time =", value, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("shoes_offsale_time <>", value, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("shoes_offsale_time >", value, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shoes_offsale_time >=", value, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeLessThan(Date value) {
            addCriterionForJDBCDate("shoes_offsale_time <", value, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shoes_offsale_time <=", value, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeIn(List<Date> values) {
            addCriterionForJDBCDate("shoes_offsale_time in", values, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("shoes_offsale_time not in", values, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shoes_offsale_time between", value1, value2, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesOffsaleTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shoes_offsale_time not between", value1, value2, "shoesOffsaleTime");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountIsNull() {
            addCriterion("shoes_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountIsNotNull() {
            addCriterion("shoes_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountEqualTo(Integer value) {
            addCriterion("shoes_sale_count =", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountNotEqualTo(Integer value) {
            addCriterion("shoes_sale_count <>", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountGreaterThan(Integer value) {
            addCriterion("shoes_sale_count >", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_sale_count >=", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountLessThan(Integer value) {
            addCriterion("shoes_sale_count <", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_sale_count <=", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountIn(List<Integer> values) {
            addCriterion("shoes_sale_count in", values, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountNotIn(List<Integer> values) {
            addCriterion("shoes_sale_count not in", values, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("shoes_sale_count between", value1, value2, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_sale_count not between", value1, value2, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesGenderIsNull() {
            addCriterion("shoes_gender is null");
            return (Criteria) this;
        }

        public Criteria andShoesGenderIsNotNull() {
            addCriterion("shoes_gender is not null");
            return (Criteria) this;
        }

        public Criteria andShoesGenderEqualTo(Byte value) {
            addCriterion("shoes_gender =", value, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderNotEqualTo(Byte value) {
            addCriterion("shoes_gender <>", value, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderGreaterThan(Byte value) {
            addCriterion("shoes_gender >", value, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("shoes_gender >=", value, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderLessThan(Byte value) {
            addCriterion("shoes_gender <", value, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderLessThanOrEqualTo(Byte value) {
            addCriterion("shoes_gender <=", value, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderIn(List<Byte> values) {
            addCriterion("shoes_gender in", values, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderNotIn(List<Byte> values) {
            addCriterion("shoes_gender not in", values, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderBetween(Byte value1, Byte value2) {
            addCriterion("shoes_gender between", value1, value2, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("shoes_gender not between", value1, value2, "shoesGender");
            return (Criteria) this;
        }

        public Criteria andShoesStatusIsNull() {
            addCriterion("shoes_status is null");
            return (Criteria) this;
        }

        public Criteria andShoesStatusIsNotNull() {
            addCriterion("shoes_status is not null");
            return (Criteria) this;
        }

        public Criteria andShoesStatusEqualTo(Byte value) {
            addCriterion("shoes_status =", value, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusNotEqualTo(Byte value) {
            addCriterion("shoes_status <>", value, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusGreaterThan(Byte value) {
            addCriterion("shoes_status >", value, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("shoes_status >=", value, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusLessThan(Byte value) {
            addCriterion("shoes_status <", value, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusLessThanOrEqualTo(Byte value) {
            addCriterion("shoes_status <=", value, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusIn(List<Byte> values) {
            addCriterion("shoes_status in", values, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusNotIn(List<Byte> values) {
            addCriterion("shoes_status not in", values, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusBetween(Byte value1, Byte value2) {
            addCriterion("shoes_status between", value1, value2, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andShoesStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("shoes_status not between", value1, value2, "shoesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}