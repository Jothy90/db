<!DOCTYPE html>
<html lang="en">
<!-- Mirrored from bucketadmin.themebucket.net/form_wizard.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 18 Oct 2014 09:20:19 GMT -->
<head>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="images/favicon.html">

    <title>SenzMate Applications Home</title>

    <!--Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/bootstrap-reset.css" rel="stylesheet">
    <link href="resources/css/font-awesome.css" rel="stylesheet"/>

    <link rel="stylesheet" href="resources/css/jquery.stepsc4ca.css?1">

    <link rel="stylesheet" href="resources/css/data-tables/DT_bootstrap.css" />

    <!-- Custom styles for this template -->
    <link href="resources/css/style.css" rel="stylesheet">
    <link href="resources/css/style-responsive.css" rel="stylesheet"/>

</head>

<body>

<section id="container">
    >
    <!--header end-->

    <!--main content start-->
    <section id="main-content" style="margin-left: 0px">

        <section class="wrapper">
            <!-- page start-->


            <div class="row">
                <div class="col-sm-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Device Table
                        <span class="tools pull-right">
                            <a href="javascript:;" class="fa fa-chevron-down"></a>
                            <a href="javascript:;" class="fa fa-cog"></a>
                            <a href="javascript:;" class="fa fa-times"></a>
                         </span>
                        </header>
                        <div class="panel-body">
                            <div class="adv-table editable-table ">
                                <div class="clearfix">
                                    <div class="btn-group">
                                        <button id="editable-sample_new" class="btn btn-primary">
                                            Add New <i class="fa fa-plus"></i>
                                        </button>
                                    </div>
                                    <div class="btn-group pull-right">
                                        <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">Tools <i class="fa fa-angle-down"></i>
                                        </button>
                                        <ul class="dropdown-menu pull-right">
                                            <li><a href="#">Print</a></li>
                                            <li><a href="#">Save as PDF</a></li>
                                            <li><a href="#">Export to Excel</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="space15"></div>
                                <table class="table table-striped table-hover table-bordered" id="editable-sample">
                                    <thead>
                                    <tr>
                                        <th>Device</th>
                                        <th>Edit</th>
                                        <th>Delete</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${devices}" var="device">
                                        <tr class="">
                                            <td><c:out value="${device.id}"/></td>
                                            <td><a class="edit" href="javascript:;">Edit</a></td>
                                            <td><a class="delete" href="javascript:;">Delete</a></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </section>
        <!-- page end-->

    </section>
    <!--main content end-->


</section>

<!-- Placed js at the end of the document so the pages load faster -->

<!--Core js-->
<script src="resources/js/jquery-1.8.3.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script class="include" type="text/javascript" src="resources/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="resources/js/jquery.scrollTo.min.js"></script>

<script src="resources/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>

<script src="resources/js/jquery.slimscroll.js"></script>
<script src="resources/js/jquery.nicescroll.js"></script>

<script type="text/javascript" src="resources/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="resources/js/DT_bootstrap.js"></script>


<!--common script init for all pages-->
<script src="resources/js/scripts.js"></script>


<!--script for this page only-->
<script src="resources/js/table-editable.js"></script>

<script type="text/javascript">
    jQuery(document).ready(function() {
        EditableTable.init();
    });
</script>

</body>
</html>