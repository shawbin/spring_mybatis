package io.exhub.exhub_access.common;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Object.class)
public class JsonTypeHandler extends BaseTypeHandler<Object> {


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        preparedStatement.setObject(i,o.toString());
    }

    @Override
    public Object getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return JSONObject.parseObject(resultSet.getString(s));
    }

    @Override
    public Object getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return JSONObject.parseObject(resultSet.getString(i));
    }

    @Override
    public Object getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return JSONObject.parseObject(callableStatement.getString(i));
    }
}
