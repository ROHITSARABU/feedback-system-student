<div class="container">

	<div class="row">
		<!-- would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display products -->

		<div class="col-md-9">

			<!-- added breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">


					<C:if test="${userClickCategoryProducts==true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>

							<li class="active">All Products</li>

						</ol>
					</C:if>


					<C:if test="${userClickAllProducts==true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>

							<li class="active">Category</a></li>
							<li class="active">${category.name}</li>
						</ol>
					</C:if>
				</div>


			</div>


		</div>


	</div>


</div>