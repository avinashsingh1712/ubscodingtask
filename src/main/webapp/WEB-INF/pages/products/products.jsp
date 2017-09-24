
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <h2>
        <span class="glyphicon glyphicon-tag" style="color: darkkhaki"></span> &nbsp;
        <ins>Product lists</ins>
    </h2>
    <div class="row">
        <c:forEach var="product" items="${productItems}">
            <div class="col-md-4">
                <div class="thumbnail">
                   
                    <div class="caption">
                        <h4 class="pull-right">
                            <span class="glyphicon glyphicon-eur"></span>${product.value.unit}
                        </h4>
                        <h4>
                            <a href="#" data-toggle="modal"
                               data-target="#product_view_${product.key.id}">${product.key.item}</a>
                        </h4>
                       <p>Product description of product ${product.key.item}
                            </p>
                    </div>
                    
                    <div class="space-ten"></div>
                    <div class="btn-ground text-center">
                        <button type="button" class="btn btn-primary" data-toggle="modal"
                                data-target="#product_view_${product.key.id}"><i class="fa fa-search"></i>
                            Quick View
                        </button>
                    </div>
                    <div class="space-ten"></div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<!-- End of products.jspf -->