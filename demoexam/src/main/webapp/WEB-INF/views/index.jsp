<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- ===============================================-->
    <!--    Favicons-->
    <!-- ===============================================-->
    <link rel="apple-touch-icon" sizes="180x180" href="../../assets/img/favicons/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="../../assets/img/favicons/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="../../assets/img/favicons/favicon-16x16.png">
    <link rel="shortcut icon" type="image/x-icon" href="../../assets/img/favicons/favicon.ico">
    <link rel="manifest" href="../../assets/img/favicons/manifest.json">
    <meta name="msapplication-TileImage" content="../../assets/img/favicons/mstile-150x150.png">
    <meta name="theme-color" content="#ffffff">
    <script src="../../vendors/imagesloaded/imagesloaded.pkgd.min.js"></script>
    <script src="../../vendors/simplebar/simplebar.min.js"></script>
    <script src="../../assets/js/config.js"></script>


    <!-- ===============================================-->
    <!--    Stylesheets-->
    <!-- ===============================================-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="">
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&amp;display=swap" rel="stylesheet">
    <link href="../../vendors/simplebar/simplebar.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
    <link href="../../assets/css/theme-rtl.min.css" type="text/css" rel="stylesheet" id="style-rtl">
    <link href="../../assets/css/theme.min.css" type="text/css" rel="stylesheet" id="style-default">
    <link href="../../assets/css/user-rtl.min.css" type="text/css" rel="stylesheet" id="user-style-rtl">
    <link href="../../assets/css/user.min.css" type="text/css" rel="stylesheet" id="user-style-default">
    <script>
      var phoenixIsRTL = window.config.config.phoenixIsRTL;
      if (phoenixIsRTL) {
        var linkDefault = document.getElementById('style-default');
        var userLinkDefault = document.getElementById('user-style-default');
        linkDefault.setAttribute('disabled', true);
        userLinkDefault.setAttribute('disabled', true);
        document.querySelector('html').setAttribute('dir', 'rtl');
      } else {
        var linkRTL = document.getElementById('style-rtl');
        var userLinkRTL = document.getElementById('user-style-rtl');
        linkRTL.setAttribute('disabled', true);
        userLinkRTL.setAttribute('disabled', true);
      }
    </script>
</head>
<body>
	<%@include file="menu.jsp" %>
	<div class="row">
	 <div class="kanban-container  scrollbar"style="width:100%; height:100%; data-kanban-container="data-kanban-container">
        
          
          <div class="kanban-column scrollbar">
            <div class="kanban-column-header px-4 hover-actions-trigger">
              <div class="d-flex align-items-center border-bottom border-3 py-3 border-300">
                <h5 class="mb-0 kanban-column-title">To do<span class="kanban-title-badge">1</span></h5>
                
              </div>
            </div>
            <div class="kanban-items-container" data-sortable="data-sortable">
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="position-relative mb-2 overflow-hidden rounded" style="height:200px; width:100%">
                      <div class="bg-holder" style="background-image:url(../../assets/img/kanban/1.jpg);">
                      </div>
                      <!--/.bg-holder-->

                    </div>
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-danger" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-danger"><span>Bug</span><span class="ms-1 d-inline-block fas fa-bug" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Test and debug code for the e-commerce website checkout process</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/30.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/57.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/25.webp" alt="" />

                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-warning" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-warning"><span>Issue</span><span class="ms-1 d-inline-block fa-solid fa-triangle-exclamation" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Write a blog post on industry trends and best practices</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1 me-3 white-space-nowrap"><span class="fa-solid fa-calendar-xmark fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>Jan 25</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/30.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/57.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/25.webp" alt="" />

                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="py-3 px-4 kanban-add-task">
              <button class="btn bg-sm bg-300 me-2 px-0" data-bs-toggle="modal" data-bs-target="#kanbanAddTask"><span class="fas fa-plus text-white dark__text-400" data-fa-transform="grow-4 down-1"></span></button>
              <input class="form-control search-input rounded-3 px-3" placeholder="Add new task" />
            </div>
          </div>
          <div class="kanban-column scrollbar">
            <div class="kanban-column-header px-4 hover-actions-trigger">
              <div class="d-flex align-items-center border-bottom border-3 py-3 border-primary">
                <h5 class="mb-0 kanban-column-title">Doing<span class="kanban-title-badge">2</span></h5>
               </div>
            </div>
            <div class="kanban-items-container" data-sortable="data-sortable">
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-danger" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-danger"><span>Bug</span><span class="ms-1 d-inline-block fas fa-bug" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Create wireframes for a new phoenix landing page design</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1 me-3 white-space-nowrap"><span class="fa-solid fa-calendar-xmark fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>Jan 25</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/57.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <div class="avatar-name rounded-circle text-warning bg-soft-warning"><span>R</span></div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-secondary" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-secondary"><span>Undefined</span><span class="ms-1 d-inline-block fas fa-spinner" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Set up and configure a new software tool for the marketing team</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa fa-check-square fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>5/34</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/25.webp" alt="" />

                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-primary" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-primary"><span>Feature</span><span class="ms-1 d-inline-block fas fa-check-double" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Draft and send a press release to announce a new partnership</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1 me-3 white-space-nowrap"><span class="fa-solid fa-calendar-xmark fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>Jan 25</p>
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="position-relative mb-2 overflow-hidden rounded" style="height:200px; width:100%">
                      <div class="bg-holder" style="background-image:url(../../assets/img/kanban/glass.jpg);">
                      </div>
                      <!--/.bg-holder-->

                    </div>
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-warning" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-warning"><span>Issue</span><span class="ms-1 d-inline-block fa-solid fa-triangle-exclamation" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Conduct a security audit of the phoenix web applications</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1 me-3 white-space-nowrap"><span class="fa-solid fa-calendar-xmark fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>Jan 25</p>
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="py-3 px-4 kanban-add-task">
              <button class="btn bg-sm bg-300 me-2 px-0" data-bs-toggle="modal" data-bs-target="#kanbanAddTask"><span class="fas fa-plus text-white dark__text-400" data-fa-transform="grow-4 down-1"></span></button>
              <input class="form-control search-input rounded-3 px-3" placeholder="Add new task" />
            </div>
          </div>
          <div class="kanban-column scrollbar">
            <div class="kanban-column-header px-4 hover-actions-trigger">
              <div class="d-flex align-items-center border-bottom border-3 py-3 border-info">
                <h5 class="mb-0 kanban-column-title">Review<span class="kanban-title-badge">3</span></h5>
                </div>
            </div>
            <div class="kanban-items-container" data-sortable="data-sortable">
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-warning" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-warning"><span>Issue</span><span class="ms-1 d-inline-block fa-solid fa-triangle-exclamation" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Design and develop a new logo for the phoenix</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/57.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/25.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/30.webp" alt="" />

                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-warning" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-warning"><span>Issue</span><span class="ms-1 d-inline-block fa-solid fa-triangle-exclamation" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Create a fresh visual identity for Phoenix with a new logo design</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa fa-check-square fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>5/34</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/25.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/57.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/30.webp" alt="" />

                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-secondary" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-secondary"><span>Undefined</span><span class="ms-1 d-inline-block fas fa-spinner" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Identify best software vendors for company-wide system through comprehensive research and evaluation</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="position-relative mb-2 overflow-hidden rounded" style="height:200px; width:100%">
                      <div class="bg-holder" style="background-image:url(../../assets/img/kanban/wall.jpg);">
                      </div>
                      <!--/.bg-holder-->

                    </div>
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-primary" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-primary"><span>Feature</span><span class="ms-1 d-inline-block fas fa-check-double" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Write and edit copy for a new email marketing campaign</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="py-3 px-4 kanban-add-task">
              <button class="btn bg-sm bg-300 me-2 px-0" data-bs-toggle="modal" data-bs-target="#kanbanAddTask"><span class="fas fa-plus text-white dark__text-400" data-fa-transform="grow-4 down-1"></span></button>
              <input class="form-control search-input rounded-3 px-3" placeholder="Add new task" />
            </div>
          </div>
          <div class="kanban-column scrollbar">
            <div class="kanban-column-header px-4 hover-actions-trigger">
              <div class="d-flex align-items-center border-bottom border-3 py-3 border-success">
                <h5 class="mb-0 kanban-column-title">Release<span class="kanban-title-badge">3</span></h5>
                </div>
            </div>
            <div class="kanban-items-container" data-sortable="data-sortable">
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-primary" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-primary"><span>Feature</span><span class="ms-1 d-inline-block fas fa-check-double" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Improve Phoenix website usability through user testing</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/57.webp" alt="" />

                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="position-relative mb-2 overflow-hidden rounded" style="height:200px; width:100%">
                      <div class="bg-holder" style="background-image:url(../../assets/img/kanban/home.jpg);">
                      </div>
                      <!--/.bg-holder-->

                    </div>
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-danger" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-danger"><span>Bug</span><span class="ms-1 d-inline-block fas fa-bug" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Develop and deliver a training program for new employees</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/57.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/25.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/30.webp" alt="" />

                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="sortable-item-wrapper border-bottom px-2 py-2">
                <div class="card sortable-item hover-actions-trigger">
                  <div class="card-body py-3 px-3">
                    <div class="kanban-status mb-1 position-relative lh-1"><span class="fa fa-circle me-2 d-inline-block text-secondary" style="min-width:1rem" data-fa-transform="shrink-1 down-3"></span><span class="badge badge-phoenix fs--2 badge-phoenix-secondary"><span>Undefined</span><span class="ms-1 d-inline-block fas fa-spinner" data-fa-transform="up-2" style="height:7.8px;width:7.8px;"></span></span>
                      <div class="font-sans-serif">
                        <button class="btn btn-sm btn-phoenix-default kanban-item-dropdown-btn hover-actions" type="button" data-boundary="viewport" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-ellipsis-h fa-rotate-90" data-fa-transform="shrink-2"></span></button>
                        <div class="dropdown-menu dropdown-menu-end py-2" style="width: 15rem;"><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Duplicate</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to top</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Jump to bottom</span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Print/Download</span></a><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Share</span><span class="fas fa-angle-right fs--2"></span></a>
                          <hr class="my-2" /><a class="dropdown-item d-flex flex-between-center border-1 undefined" href="#!"><span>Move to archive</span><span class="fas fa-angle-right fs--2"></span></a><a class="dropdown-item d-flex flex-between-center border-1 text-danger" href="#!"><span>Delete</span></a>
                        </div>
                      </div>
                    </div>
                    <p class="mb-0 stretched-link" data-bs-toggle="modal" data-bs-target="#KanbanItemDetailsModal">Organize and lead a brainstorming session to generate new product ideas</p>
                    <div class="d-flex mt-2 align-items-center">
                      <p class="mb-0 text-600 fs--1 lh-1"><span class="fa-solid fa-paperclip fs--1 me-2 d-inline-block" style="min-width: 1rem;"></span>15</p>
                      <div class="avatar-group ms-auto">
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/57.webp" alt="" />

                        </div>
                        <div class="avatar avatar-s  border border-white rounded-pill">
                          <img class="rounded-circle " src="../../assets/img/team/25.webp" alt="" />

                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="py-3 px-4 kanban-add-task">
              <button class="btn bg-sm bg-300 me-2 px-0" data-bs-toggle="modal" data-bs-target="#kanbanAddTask"><span class="fas fa-plus text-white dark__text-400" data-fa-transform="grow-4 down-1"></span></button>
              <input class="form-control search-input rounded-3 px-3" placeholder="Add new task" />
            </div>
          </div>
         
        </div>
      
      </div>
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
           
            
	    <!-- ===============================================-->
    <!--    JavaScripts-->
    <!-- ===============================================-->
    <script src="../../vendors/popper/popper.min.js"></script>
    <script src="../../vendors/bootstrap/bootstrap.min.js"></script>
    <script src="../../vendors/anchorjs/anchor.min.js"></script>
    <script src="../../vendors/is/is.min.js"></script>
    <script src="../../vendors/fontawesome/all.min.js"></script>
    <script src="../../vendors/lodash/lodash.min.js"></script>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
    <script src="../../vendors/list.js/list.min.js"></script>
    <script src="../../vendors/feather-icons/feather.min.js"></script>
    <script src="../../vendors/dayjs/dayjs.min.js"></script>
    <script src="../../vendors/sortablejs/sortable.min.js"></script>
    <script src="../../vendors/dropzone/dropzone.min.js"></script>
    <script src="../../assets/js/phoenix.js"></script>
</body>
</html>