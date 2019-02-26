package enums;

public enum CategorySQL {
	COUNT, ALL_CATE_LIST;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch(this){
		case ALL_CATE_LIST:
			query.append("SELECT * FROM CATEGORIES");
		break;
		case COUNT:
			query.append("SELECT COUNT(*) COUNT FROM CATEGORIES");
		break;
		}
		return query.toString();
	}
}
